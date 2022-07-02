package com.example.demo;

import com.example.demo.user.MyUser;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import java.security.Principal;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class TaskServiceTest {
//
//    @Test
//    void shouldAddATask() {
//
//        Task todo = new Task("neu", "blabla", Status.OPEN,);
//
//
//
//        TaskRepo taskRepo = Mockito.mock(TaskRepo.class);
//        TaskService taskService = new TaskService(taskRepo);
//        //when
//        taskService.addTask(todo);
//        //then
//        Mockito.verify(taskRepo).save(todo);
//
//    }
//
//    @Test
//    void shouldReturnAllTasks() {
//        //given
//        Task todo = new Task("neu", "blabla", Status.OPEN);
//        Task todo2 = new Task("neuer", "blablablablabla", Status.OPEN);
//        Task todo3 = new Task("am neusten", "blablablablablabla", Status.OPEN);
//
//
//
//
//        TaskRepo taskRepo = Mockito.mock(TaskRepo.class);
//        TaskService taskService = new TaskService(taskRepo);
//        //when
//        Mockito.when(taskRepo.findAll()).thenReturn(List.of(todo, todo2, todo3));
//
//        //then
//        assertThat(taskService.getTasks()).contains(todo, todo2, todo3);
//
//
//   }
//
//    @Test
//    void shouldEditATask() {
//        //given
//        Task todo = new Task("neu", "blabla", Status.OPEN);
//        TaskRepo taskRepo = Mockito.mock(TaskRepo.class);
//        TaskService taskService = new TaskService(taskRepo);
//
//        //when and then
//        taskService.editTask(todo);
//        Mockito.verify(taskRepo).save(todo);
//
//
//
//    }
//
//    @Test
//    void shouldDeleteATask() {
//        //given
//        Task todo = new Task("neu", "blabla", Status.OPEN);
//        TaskRepo taskRepo = Mockito.mock(TaskRepo.class);
//        TaskService taskService = new TaskService(taskRepo);
//        //when and then
//        taskService.deleteTask(todo.getId());
//        Mockito.verify(taskRepo).deleteById(todo.getId());
//
//    }
//    @Test
//    void shouldChangeStatusToPreviousStatus() {
//
//        //given
//        Task todo = new Task("neu", "blabla", Status.OPEN);
//        TaskRepo taskRepo = Mockito.mock(TaskRepo.class);
//        TaskService taskService = new TaskService(taskRepo);
//        //when and then
//        taskService.changeStatusBackwards(todo);
//        todo.setStatus(todo.getStatus().changeBackwards());
//        Mockito.verify(taskRepo).save(todo);
//
//    }
//    @Test
//    void shouldFailIfTaskIDIsWrong() {
//
//        //given
//        Task todo = new Task("neu", "blabla", Status.OPEN);
//        TaskRepo taskRepo = Mockito.mock(TaskRepo.class);
//        TaskService taskService = new TaskService(taskRepo);
//
//        //when
//        Mockito.when(taskRepo.findById("WrongID1234")).thenReturn(Optional.of(todo));
//        //then
//        Assertions.assertThat(taskService.getTask(todo.getId())).isNotEqualTo(todo);
//
//
//
//
//    }
//
//
//


    }
