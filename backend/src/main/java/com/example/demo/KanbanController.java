package com.example.demo;

import com.example.demo.user.MyUser;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/kanban")
@RequiredArgsConstructor
@CrossOrigin
public class KanbanController {

    private final TaskService taskService;

    @PostMapping()
    public void addTask(@RequestBody Task task,Principal username) {
        taskService.addTask(task,username.getName());

    }

    @GetMapping()
    public List<Task> getTasks(Principal username) {
        return taskService.getTasks(username.getName());

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



