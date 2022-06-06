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
        return this.status.equals("OPEN") ? Status.IN_PROGRESS : Status.DONE;

    }

    Status changeBackwards() {
        return this.status.equals("DONE") ? Status.IN_PROGRESS : Status.OPEN;
    }

}
