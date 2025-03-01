package com.example.demo;

import com.example.demo.user.MyUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepo taskRepo;

    public void addTask(Task taskToAdd,String principal) {
       taskToAdd.setUsername(principal);
        taskRepo.save(taskToAdd);
    }

    public List<Task> getTasks(String principal) {
        return taskRepo.findAllByUsername(principal);
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
        return taskRepo.findById(id);
    }


    public void deleteTask(String id) {
       taskRepo.deleteById(id);
    }
}

