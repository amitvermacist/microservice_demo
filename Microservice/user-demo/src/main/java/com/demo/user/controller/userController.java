package com.demo.user.controller;

import com.demo.user.ValueObj.ResponseTemp;
import com.demo.user.entity.user;
import com.demo.user.service.userService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class userController {
    @Autowired
    private userService user_service;

    @PostMapping("/")
    public  user saveUser(@RequestBody user users){
        log.info("post user service");
        return  userService.saveUser(users);
    }

    //get the details as well as dep service
    @GetMapping("/{id}")
    public ResponseTemp getUserWithDep(@PathVariable("id")  Long userID){
        log.info("get the information with dep");
        return  userService.getUserWithDep(userID);
    }


}
