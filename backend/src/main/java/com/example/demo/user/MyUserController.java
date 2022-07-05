package com.example.demo.user;


import com.example.demo.security.JWTService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

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

    @GetMapping
    public String getUsername(Principal principal) {
        return principal.getName();
    }







}
