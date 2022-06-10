package com.example.demo;

public enum Status {

    OPEN("OPEN"),
    IN_PROGRESS("IN_PROGRESS"),
    DONE("DONE");


    private String status;

    Status(String status) {
        this.status = status;
    }

    Status changeForward() {
        return this == OPEN ? IN_PROGRESS : DONE;

    }

    Status changeBackwards() {
        return this == DONE ? IN_PROGRESS : OPEN;
    }

}
