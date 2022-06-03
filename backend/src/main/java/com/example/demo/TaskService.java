package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepo taskRepo;

    void addTask(Task taskToAdd) {
        taskRepo.addTask(taskToAdd);
    }
    List<Task> getTask(){
        return taskRepo.getTask();
    }
    void promoteTask(Task task){
        return taskRepo.promoteTask(task);
    }

}
