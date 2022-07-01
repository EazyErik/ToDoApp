package com.example.demo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MyUserService {

    private final MyUserRepo myUserRepo;
    private final PasswordEncoder encoder;


    public void createNewUser(UserCreationData userCreationData) {

        String encodedPassword = encoder.encode(userCreationData.getPassword());
        MyUser myUser = new MyUser();
        myUser.setUsername(userCreationData.getUsername());
        myUser.setPassword(encodedPassword);
        myUser.setRoles(Collections.singletonList("user"));
        myUserRepo.save(myUser);


    }

    public Optional<MyUser> findByUserName(String username) {
        return myUserRepo.findByUsername(username);
    }
}
