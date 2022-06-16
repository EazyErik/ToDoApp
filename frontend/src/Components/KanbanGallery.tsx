import KanbanCard from "./KanbanCard";
import {useEffect, useState} from "react";
import {Model} from "../Model";


interface KanbanBoardProps{
    allTasks:Array<Model>;

}


export default function KanbanGallery(props:KanbanBoardProps) {

    const taskCardArray = props.allTasks.map(taskCard =><KanbanCard infos={taskCard}/>)


    return(
        <div>
            {taskCardArray}
        </div>
    )

}