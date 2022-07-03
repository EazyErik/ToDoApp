import {FormEvent, useEffect, useState} from "react";
import {useNavigate} from "react-router-dom";
import {logInNow} from "./apiService/apiServices";


export default function LoginPage() {

    const [username, setUsername] = useState("")
    const[password, setPassword] = useState("")
    const[error, setError] = useState("")
    const nav = useNavigate()


    const login = (event:FormEvent) => {
        event.preventDefault()
        logInNow(username,password)
            .then(loginResponse => localStorage.setItem("jwt",loginResponse.token))
            .then(() => nav("/"))
            .catch(() => setError("Login not possible"))

    }

    return(

        <div className={"Login"}>
            <h1>Please Login:</h1>
            <form onSubmit={login}>
                <input type={"text"} placeholder={"Username"} onChange={event => setUsername(event.target.value)}/>
                <input type={"password"} placeholder={"Password"} onChange={event => setPassword(event.target.value)}/>
                <input type={"submit"} value={"Login now"} />
            </form>
            {error && <div>{error}</div>}
            <div className={"signUp"}>
                <h3>Don't have an account yet?</h3>

                <button onClick={() => nav("/register")}> Sign up</button>
            </div>

        </div>

    )
}