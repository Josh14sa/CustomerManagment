package com.customerManagement.customermanagement.infraestructure.controllers;

import com.customerManagement.customermanagement.domain.models.Users;
import com.customerManagement.customermanagement.infraestructure.repositories.port.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("Users")
public class UsersController {

    private final UserRepository userRepository;
    @PostMapping
    public ResponseEntity<?> saveUsers(@RequestBody Users user){
        try{
            Users usersave =userRepository.save(user);
            return new ResponseEntity<Users>(usersave , HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<String>(e.getCause().toString(),
                                     HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
