package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/kanban")
@RequiredArgsConstructor
@CrossOrigin
public class KanbanController {

    private final TaskService taskService;

    @PostMapping()
    public void addTask(@RequestBody Task task) {
        taskService.addTask(task);

    }

    @GetMapping()
    public List<Task> getTasks() {
        return taskService.getTasks();

    }
    @PutMapping("/next")
    public void changeStatusForward(@RequestBody Task task){
        taskService.changeStatusForward(task);

    }
    @PutMapping("/prev")
    public void changeStatusBackwards(@RequestBody Task task){
        taskService.changeStatusBackwards(task);
    }

    @GetMapping("/{id}")
    public Optional<Task> getTask(@PathVariable String id){
        return taskService.getTask(id);

    }
    @PutMapping()
    public void editTask(@RequestBody Task task){
        taskService.editTask(task);

    }
    @DeleteMapping(path = "/{id}")
    public void deleteTask(@PathVariable String id) {
        taskService.deleteTask(id);
    }
}



