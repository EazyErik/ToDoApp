import {FormEvent, useEffect, useState} from "react";
import {useNavigate} from "react-router-dom";

export default function RegisterPage() {

    const [username,setUsername] = useState("")
    const [password,setPassword] = useState("")


    const nav = useNavigate()

    const register= (event:FormEvent) => {
        event.preventDefault()



    }

    return(
        <div>
            <h1>Please register:</h1>
            <form onSubmit={register} >
                <input type={"text"} placeholder={"Username"} onChange={event => setUsername(event.target.value)}/>
                <input type={"password"} placeholder={"Password"} onChange={event => setPassword(event.target.value)}/>
                <input type={"submit"} value={"Register now"}/>

            </form>
        </div>
    )
}