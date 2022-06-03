package com.example.demo;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor

public class Task {

    private final String task;
    private final String description;
    private final String status;
    private final String id = UUID.randomUUID().toString();
}
