package com.example.demo;

import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface TaskRepo extends MongoRepository<Task, String> {

Task getTasksById(String id);

    void deleteById(String id);

    List<Task> getTasksBy();
}



