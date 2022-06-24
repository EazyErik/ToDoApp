package com.example.demo;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@NoArgsConstructor
@Document(collection = "kanbans")
public class Task {

    private  String task;
    private  String description;
    private  Status status;
    @Id
    private String id;

    public Task(String task, String description, Status status) {
        this.task = task;
        this.description = description;
        this.status = status;
    }
}
