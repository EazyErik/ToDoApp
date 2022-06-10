import {useEffect, useState} from "react";
import Headline from "./Headline";
import InputFields from "./InputFields";
import KanbanGallery from "./KanbanGallery";



export function KanbanBoard() {
    // const [tasks,setTasks] = useState([]);
    // useEffect(() => {
    //     fetch("http://localhost:8080/api/kanban",{method:"GET"})
    //         .then(response => response.json())
    //         .then(data => setTasks(data));
    // },[])
        return(

            <div>
                <Headline/>
                <InputFields/>
                 <KanbanGallery/>

            </div>

        )

}