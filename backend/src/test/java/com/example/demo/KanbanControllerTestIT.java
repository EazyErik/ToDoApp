package com.example.demo;

import com.example.demo.user.LoginData;
import com.example.demo.user.LoginResponse;
import com.example.demo.user.MyUser;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;

import java.util.List;
import java.util.Objects;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class KanbanControllerTestIT {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void shouldTestWholeApp() {
        //create new user
        MyUser newUser = new MyUser();
        newUser.setUsername("norman");
        newUser.setPassword("wurst");

        ResponseEntity<Void> createdUserResponse = restTemplate.postForEntity("/api/user", newUser, Void.class);
        Assertions.assertThat(createdUserResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
        LoginData loggedInUser = new LoginData();
        loggedInUser.setUsername("norman");
        loggedInUser.setPassword("wurst");
        ResponseEntity<LoginResponse> loggedInUserResponse = restTemplate.postForEntity("/api/login", loggedInUser, LoginResponse.class);
        Assertions.assertThat(loggedInUserResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
        String jwt = loggedInUserResponse.getBody().getToken();
        Assertions.assertThat(jwt).isNotBlank();



        Task task1 = new Task("neu","blabla",Status.OPEN,"1");
        ResponseEntity<Void> voidResponseEntity = restTemplate.exchange(
                "/api/kanban",
                HttpMethod.POST,
                new HttpEntity<>(task1,createHeaders(jwt)),
                 Void.class);
        Assertions.assertThat(voidResponseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        ResponseEntity<Task[]> getResponse = restTemplate.exchange(
                "/api/kanban",
                HttpMethod.GET,
                new HttpEntity<>(createHeaders(jwt)),
                Task[].class);

        Assertions.assertThat(Objects.requireNonNull(getResponse.getBody()).length).isEqualTo(1);


        restTemplate.exchange(
                "/api/kanban/next",
                HttpMethod.PUT,
                new HttpEntity<>(task1, createHeaders(jwt)),
                Void.class);
        ResponseEntity<Task> getResponse2 = restTemplate.exchange(
                "/api/kanban/" + task1.getId(),
                HttpMethod.GET,
                new HttpEntity<>(createHeaders(jwt)),
                Task.class);
        Assertions.assertThat(getResponse2.getBody().getStatus()).isEqualTo(Status.IN_PROGRESS);

    }
    private HttpHeaders createHeaders(String jwt) {
        String authHeaderValue = "Bearer " + jwt;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", authHeaderValue);
        return headers;
    }











}