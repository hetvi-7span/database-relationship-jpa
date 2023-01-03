package com.jpa.relationship.onetoone.parentTable.controller;


import com.jpa.relationship.onetoone.parentTable.entity.OneToOneParentUser;
import com.jpa.relationship.onetoone.parentTable.service.OneToOneParentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/oneToOne/parent")
public class OneToOneParentUserController {

    @Autowired
    OneToOneParentUserService oneToOneParentUserService;


    @PostMapping
    public OneToOneParentUser createUser(@RequestBody OneToOneParentUser user){
       return oneToOneParentUserService.createUser(user);
    }

    @GetMapping
    public List<OneToOneParentUser> getUsers(){
        return oneToOneParentUserService.getUsers();
    }




}
