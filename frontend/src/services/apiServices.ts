import axios from "axios";
import {Task} from "../components/model";

export function fetchAllTasks() {
    return axios.get("/api/kanban", {
        headers: {
            Authorization: `Bearer ${localStorage.getItem("jwt")}`
        }
    })
        .then(response => response.data);

}

export function createTask(task:Task) {
    return   axios.post("/api/kanban",task, {
        headers: {
            Authorization: `Bearer ${localStorage.getItem("jwt")}`
        }
    })
}

export function deleteTask(taskId:string) {
    return axios.delete(`/api/kanban/${taskId}`, {
        headers: {
            Authorization: `Bearer ${localStorage.getItem("jwt")}`
        }
    })
}

export function promoteTask(task:Task) {
    return axios.put(`/api/kanban/next`,task, {
        headers: {
            Authorization: `Bearer ${localStorage.getItem("jwt")}`
        }
    })
}
export function demoteTask(task:Task) {
    return axios.put(`/api/kanban/prev`,task)
}

export function getKanbanById(id:string) {
    return axios.get(`/api/kanban/${id}`, {
        headers: {
            Authorization: `Bearer ${localStorage.getItem("jwt")}`
        }
    })


}

export function putUpdatedKanban(task:Task) {
    return axios.put(`/api/kanban/`,task, {
        headers: {
            Authorization: `Bearer ${localStorage.getItem("jwt")}`
        }
    })
        .then(response => response.data)
}
