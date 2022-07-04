package com.example.demo;

import com.example.demo.user.MyUser;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.security.Principal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "kanbans")
public class Task {

    private String task;
    private String description;
    private Status status;
    @Id
    private String id;
    private String username;


    public Task(String task, String description, Status status, String id) {
        this.task = task;
        this.description = description;
        this.status = status;
        this.id = id;

    }
}
