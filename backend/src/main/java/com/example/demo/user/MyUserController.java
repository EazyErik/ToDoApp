package com.example.demo.user;


import com.example.demo.security.JWTService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class MyUserController {

    private final MyUserService myUserService;



    @PostMapping
    public ResponseEntity<Void> postNewUser(@RequestBody UserCreationData userCreationData) {
        try{
            myUserService.createNewUser(userCreationData);
            return ResponseEntity.ok().build();
        }catch(IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        }
    }






}
