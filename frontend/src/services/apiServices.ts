import axios from "axios";
import {Task} from "../components/model";

export function fetchAllTasks() {
    return axios.get("/api/kanban")
        .then(response => response.data);

}

export function createTask(task:Task) {
    return   axios.post("/api/kanban",task)
}

export function deleteTask(taskId:string) {
    return axios.delete(`/api/kanban/${taskId}`)
}

export function promoteTask(task:Task) {
    return axios.put(`/api/kanban/next`,task)
}
export function demoteTask(task:Task) {
    return axios.put(`/api/kanban/prev`,task)
}

export function getKanbanById(id:string) {
    return axios.get(`/api/kanban/${id}`)


}

export function putUpdatedKanban(task:Task) {
    return axios.put(`/api/kanban/`,task)
        .then(response => response.data)
}