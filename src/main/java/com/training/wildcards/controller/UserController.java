package com.training.wildcards.controller;

import com.training.wildcards.model.UserInfo;
import com.training.wildcards.model.UserId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("{id}")
    public UserInfo getUserInfo(@PathVariable("id") UserId userId){
        return null;
    }
}
