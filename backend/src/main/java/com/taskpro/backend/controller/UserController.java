package com.taskpro.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "this is a get mapping";
    }

    @PostMapping("/addUser")
    public String addUser(){
        return "user is added";
    }
    @PutMapping("/updateUser")
    public String updateUser(){
        return "user is updated";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "user is deleted";
    }
}
