package com.example.demo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.security.Principal;
import java.util.List;


@Repository
public interface TaskRepo extends MongoRepository<Task, String> {

 List<Task> findAllByUsername(String username);

}



