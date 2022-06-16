import {useState} from "react";


interface InputFieldProperties{
    getTasks:Function;
}



export default function InputFields(props:InputFieldProperties) {
    const[task,setTask] = useState("");
    const[description,setDescription] = useState("");

    const sendTask = () =>{
      fetch("http://localhost:8080/api/kanban" ,{
          headers: {
              'Content-Type': 'application/json'
          },
          method:"POST",
          body:JSON.stringify({
              task:task,
              description:description,
              status:"OPEN"
          })
      })
          .then(() => {setTask("")
          setDescription("")})
          .then(props.getTasks())
    }
    return (
        <div>
        <input type={"text"} placeholder={"Enter your task"} onChange={event =>
            setTask(event.target.value)} value={task}/>
    <input type={"text"} placeholder={"Enter your description"} onChange={event => setDescription(event.target.value)}value={description}/>
    <button onClick={sendTask}>add me</button>
</div>
)
}