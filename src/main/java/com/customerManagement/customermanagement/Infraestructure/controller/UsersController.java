package com.customerManagement.customermanagement.Infraestructure.controller;

import com.customerManagement.customermanagement.Infraestructure.models.Users;
import com.customerManagement.customermanagement.Infraestructure.repository.UserRepository;
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
    public ResponseEntity<?> saveUsers(@RequestBody Users users){
        try{
            Users userSave =userRepository.save(users);
            return new ResponseEntity<Users>(userSave , HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<String>(e.getCause().toString(),
                                     HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
