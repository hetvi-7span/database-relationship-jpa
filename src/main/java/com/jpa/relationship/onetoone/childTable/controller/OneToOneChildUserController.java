package com.jpa.relationship.onetoone.childTable.controller;

import com.jpa.relationship.onetoone.childTable.entity.OneToOneChildUserDetails;
import com.jpa.relationship.onetoone.childTable.service.OneToOneChildUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/oneToOne/child")
public class OneToOneChildUserController {

    @Autowired
    OneToOneChildUserService oneToOneChildUserService;


    @PostMapping
    public OneToOneChildUserDetails createUser(@RequestBody OneToOneChildUserDetails user){
       return oneToOneChildUserService.createUser(user);
    }

    @GetMapping
    public List<OneToOneChildUserDetails> getUsers(){
        return oneToOneChildUserService.getUsers();
    }


}
