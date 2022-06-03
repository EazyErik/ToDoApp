package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
        Task currentTask = taskRepo.findByID(task.getId());
        String currentStatus = currentTask.getStatus();
        switch (currentStatus) {
            case "OPEN":
                currentTask.setStatus("IN_PROGRESS");
                break;
            case "IN_PROGRESS":
                currentTask.setStatus("DONE");
                break;
            default:
                break;
        }
        taskRepo.save(currentTask);

    }

    public void changeStatusBackwards(Task task) {
        Task currentTask = taskRepo.findByID(task.getId());
        String currentStatus = currentTask.getStatus();
        switch (currentStatus) {
            case "DONE":
                currentTask.setStatus("IN_PROGRESS");
                break;
            case "IN_PROGRESS":
                currentTask.setStatus("OPEN");
                break;
            default:
                break;
        }
        taskRepo.save(currentTask);
    }

    public void editTask(Task task) {

        taskRepo.save(task);

    }

    public Task getTask(String id) {
        return taskRepo.findByID(id);
    }


    public void deleteTask(String id) {
       taskRepo.deleteTask(id);
    }
}

