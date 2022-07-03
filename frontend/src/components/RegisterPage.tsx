import {FormEvent, useEffect, useState} from "react";
import {useNavigate} from "react-router-dom";
import {registerNow} from "./apiService/apiServices";

export default function RegisterPage() {

    const [username,setUsername] = useState("")
    const [password,setPassword] = useState("")
    const [error, setError] =useState("")


    const nav = useNavigate()

    const register= (event:FormEvent) => {
        event.preventDefault()
            registerNow(username,password)
            .then(() => nav("/"))
                .catch(() => setError("Registration not possible"))

    }

    return(
        <div>
            <h1>Please register:</h1>
            <form onSubmit={register} >
                <input type={"text"} placeholder={"Username"} value={username} onChange={event => setUsername(event.target.value)}/>
                <input type={"password"} placeholder={"Password"} value={password} onChange={event => setPassword(event.target.value)}/>
                <input type={"submit"} value={"Register now"}/>

            </form>
            {error}
        </div>
    )
}