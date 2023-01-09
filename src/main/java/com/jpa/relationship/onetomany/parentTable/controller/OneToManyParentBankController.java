package com.jpa.relationship.onetomany.parentTable.controller;


import com.jpa.relationship.onetomany.parentTable.entity.OneToManyParentBank;
import com.jpa.relationship.onetomany.parentTable.service.OneToManyParentBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/oneToMany/parent")
public class OneToManyParentBankController {

    @Autowired
    OneToManyParentBankService oneToManyParentBankService;


    @PostMapping
    public OneToManyParentBank createBank(@RequestBody OneToManyParentBank bank){
       return oneToManyParentBankService.createBank(bank);
    }

    @GetMapping
    public List<OneToManyParentBank> getBanks(){
        return oneToManyParentBankService.getBanks();
    }




}
