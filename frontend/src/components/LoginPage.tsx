import {useState} from "react";
import {useNavigate} from "react-router-dom";

export default function LoginPage() {

    const [username, setUsername] = useState("")
    const[password, setPassword] = useState("")
    const nav = useNavigate()





    return(

        <div>
            <h1>Please Login:</h1>
            <form >
                <input type={"text"} placeholder={"Username"} onChange={event => setUsername(event.target.value)}/>
                <input type={"password"} placeholder={"Password"} onChange={event => setPassword(event.target.value)}/>
                <input type={"submit"} value={"Register now"} onSubmit={() => nav("/")}/>

            </form>
        </div>

    )
}