package com.example.bookStore.controllers;

import com.example.bookStore.models.User;
import  com.example.bookStore.repo.userRepo;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "users")
public class UserController {


    private userRepo userRepository;

    @Autowired
    public UserController(userRepo rep)
    {
        this.userRepository=rep;
    }

    @GetMapping("/get")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user)
    {
        userRepository.save(user);
    }

    @DeleteMapping(path = { "/{id}" })

    public ResponseEntity<?> deleteUser (@PathVariable ("id") Long id)
    {
        userRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
