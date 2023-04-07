package com.springBootJavaTPoint.javaTPoint.controller;

import com.springBootJavaTPoint.javaTPoint.model.UserRecord;
import com.springBootJavaTPoint.javaTPoint.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping()
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")

    public List<UserRecord> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping( value = "/add-user", method = RequestMethod.POST)

    public void  addUser( @RequestBody  UserRecord userRecord){
        userService.addUser(userRecord);

    }

}
