package com.example.demo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Document(collection = "kanbanUser")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyUser {

    private String username;
    private String password;
    @Id
    private String id;
    private List<String> roles;
    private String userId = UUID.randomUUID().toString();


}
