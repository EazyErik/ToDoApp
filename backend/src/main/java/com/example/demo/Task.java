package com.example.demo;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor

public class Task {

    private  String task;
    private  String description;
    private  Status status;
    private final String id = UUID.randomUUID().toString();

    public Task(String task, String description, Status status) {
        this.task = task;
        this.description = description;
        this.status = status != null ? status : Status.OPEN;
    }
}
