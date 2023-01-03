package com.jpa.relationship.onetoone.biDirectional.controller;

import com.jpa.relationship.onetoone.biDirectional.entity.OneToOneBiDUser;
import com.jpa.relationship.onetoone.biDirectional.service.OneToOneBiDUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/oneToOne/biDirectional")
public class OneToOneBiDUserController {

    @Autowired
    OneToOneBiDUserService oneToOneBiDUserService;


    @PostMapping
    public OneToOneBiDUser createUser(@RequestBody OneToOneBiDUser user){
       return oneToOneBiDUserService.createUser(user);
    }

    @GetMapping
    public List<OneToOneBiDUser> getUsers(){
        return oneToOneBiDUserService.getUsers();
    }


}
