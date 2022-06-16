enum  TaskStatus {
    OPEN ="OPEN",
    IN_PROGRESS = "IN_PROGRESS",
    DONE = "DONE"
}


export interface Model {
    id:string;
    task:string;
    description:string;
    status: TaskStatus;
}