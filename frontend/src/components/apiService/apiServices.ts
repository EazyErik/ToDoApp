import axios, {AxiosResponse} from "axios";
import {LoginResponse} from "../model";

export function registerNow(username:string, password:string) {
    return axios.post("/api/register",{username:username,password:password})

}