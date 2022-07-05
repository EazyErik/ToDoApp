import axios, {AxiosResponse} from "axios";
import {LoginResponse} from "../model";

export function registerNow(username:string, password:string) {
    return axios.post("/api/user",{username:username,password:password})

}

export function logInNow(username:string, password:string) {
    return axios.post("/api/login",{username:username, password:password})
        .then((response:AxiosResponse<LoginResponse>) => response.data)
}