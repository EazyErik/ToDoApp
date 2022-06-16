import {Model} from "../Model";
import {useState} from "react";
interface KanbanCardInterface{
    infos:Model;
}
export default function KanbanCard(props:KanbanCardInterface) {
    const [edit,setEdit] = useState()
    const statusChangedBackwards = () => {
        fetch("http://localhost:8080/api/kanban/prev",{method:"PUT",
            headers: {
                'Content-Type': 'application/json'
            },
            body:JSON.stringify(
             props.infos

            )})
            .catch(err => console.log(err.message));
    }

    const statusChangedForward = () => {
        fetch("http://localhost:8080/api/kanban/next", {
            method: "PUT",
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(
                props.infos
            )
        })
            .catch(err => console.log(err.message));

    }
    const deleteTask = () => {
        fetch("http://localhost:8080/api/kanban/" + props.infos.id, {method: "DELETE"})
            .catch(err => console.log(err.message));
    }

    const editTask = () => {
        props.infos.task;
        props.infos.description;



    }

    return (
        <div>
            <p>{props.infos.task}</p>
            <p>{props.infos.description}</p>
            <p>{props.infos.status}</p>
            {props.infos.status == "OPEN" ?
                <button onClick={deleteTask}>delete</button> :
                <button onClick={statusChangedBackwards}>back</button>}
            {props.infos.status == "DONE" ?
                <button onClick={deleteTask}>delete</button> :
                <button onClick={statusChangedForward}>forward</button>}


            <button onClick={editTask}>edit</button><br/>
            <input type="text" placeholder={"edit your task"}/>
            <input type="text" placeholder={"edit your description"}/>

        </div>
    )
}