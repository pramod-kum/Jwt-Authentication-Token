package com.jwt_example.controllers;

import com.jwt_example.models.User;
import com.jwt_example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
      public List<User> getUser(){
        System.out.println("getting users");
        System.out.println(this.userService.getUsers()+"kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
          return this.userService.getUsers();

    }
    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
           return principal.getName();
    }
}
