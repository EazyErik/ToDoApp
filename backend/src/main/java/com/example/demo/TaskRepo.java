package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class TaskRepo {


    private final Map<String, Task> taskList = new HashMap<>();

    public void save(Task task) {
        taskList.put(task.getId(), task);
    }

    public List<Task> getTasks() {
        return taskList.values().stream().toList();
    }


    public Task findByID(String id) {
        return taskList.get(id);
    }

    public void deleteTask(String id) {
        taskList.remove(id);


    }


}


