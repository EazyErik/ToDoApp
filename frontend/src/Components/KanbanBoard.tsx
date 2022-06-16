import {useEffect, useState} from "react";
import Headline from "./Headline";
import InputFields from "./InputFields";
import KanbanGallery from "./KanbanGallery";

import {Model} from "../Model";



export function KanbanBoard() {
    const[allTasks,setAllTasks] = useState<Array<Model>>([])
    const getTasks = () => {
        fetch("http://localhost:8080/api/kanban",{method:"GET"})
            .then(response => response.json())
            .then(data => setAllTasks(data))

    }
    useEffect(() => {
        getTasks();
    },[])
        return(

            <div>
                <Headline/>
                <InputFields getTasks={getTasks}/>
                <KanbanGallery allTasks={allTasks}/>

            </div>

        )

}