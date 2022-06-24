package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class KanbanControllerTestIT {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void shouldTestWholeApp() {
        //given
        Task task1 = new Task("neu","blabla",Status.OPEN);
        restTemplate.postForEntity("/api/kanban",task1,Void.class);
        ResponseEntity<Task[]> getResponse = restTemplate.getForEntity("/api/kanban",Task[].class);
        Assertions.assertThat(getResponse.getBody().length).isEqualTo(1);

        restTemplate.put("/api/kanban/next",task1,Void.class);
        ResponseEntity<Task> getResponse2 = restTemplate.getForEntity("/api/kanban/" + task1.getId(),Task.class);
        Assertions.assertThat(getResponse2.getBody().getStatus()).isEqualTo(Status.IN_PROGRESS);

    }









}