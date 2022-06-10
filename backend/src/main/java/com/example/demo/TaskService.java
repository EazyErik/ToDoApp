package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepo taskRepo;

    public void addTask(Task taskToAdd) {
        taskRepo.save(taskToAdd);
    }

    public List<Task> getTasks() {
        return taskRepo.getTasks();
    }



    public void changeStatusForward(Task task) {
       task.setStatus(task.getStatus().changeForward());
       taskRepo.save(task);

    }

    public void changeStatusBackwards(Task task) {
       task.setStatus(task.getStatus().changeBackwards());
       taskRepo.save(task);

    }

    public void editTask(Task task) {

        taskRepo.save(task);

    }

    public Optional<Task> getTask(String id) {
        return Optional.ofNullable(taskRepo.findByID(id));
    }


    public void deleteTask(String id) {
       taskRepo.deleteTask(id);
    }
}

