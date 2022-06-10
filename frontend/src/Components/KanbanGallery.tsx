import KanbanCard from "./KanbanCard";

export default function KanbanGallery() {

    return(
        <div>
            <h2>OPEN</h2>
            <KanbanCard/>
            <h2>IN PROGRESS</h2>
           <KanbanCard/>
            <h2>DONE</h2>
            <KanbanCard/>
        </div>
    )

}