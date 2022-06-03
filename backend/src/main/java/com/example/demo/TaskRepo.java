package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class TaskRepo {

    private final TaskRepo taskRepo;

    private final Map<String,Task> taskList = new HashMap<>();

    List<Task> addTask(Task task) {
        return taskRepo.taskList.values().stream().toList();
    }
    List<Task> getTask(){
        return taskRepo.getTask();
    }
    Task promoteTask(Task task){
        return promoteTask(task).

        }

    }

