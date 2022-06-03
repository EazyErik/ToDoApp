package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class KanbanController {

    private final TaskService taskService;

    @PostMapping("/kanban")
    void addTask(@RequestBody Task task) {
        taskService.addTask(task);

    }

    @GetMapping("/kanban")
    List<Task> getTask() {
        return taskService.getTask();

    }
        @PutMapping("/next")
        void promoteTask(@RequestBody Task task){
        return taskService.promoteTask();
        }




    }



