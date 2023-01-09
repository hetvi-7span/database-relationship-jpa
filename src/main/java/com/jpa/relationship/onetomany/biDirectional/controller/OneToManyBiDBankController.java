package com.jpa.relationship.onetomany.biDirectional.controller;


import com.jpa.relationship.onetomany.biDirectional.entity.OneToManyBiDBank;
import com.jpa.relationship.onetomany.biDirectional.entity.OneToManyBiDBranch;
import com.jpa.relationship.onetomany.biDirectional.service.OneToManyBiDBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/oneToMany/bi")
public class OneToManyBiDBankController {

    @Autowired
    OneToManyBiDBankService oneToManyBiDBankService;


    @PostMapping("/create-bank")
    public OneToManyBiDBank createBank(@RequestBody OneToManyBiDBank bank){
       return oneToManyBiDBankService.createBank(bank);
    }

    @PostMapping("/create-branch")
    public OneToManyBiDBranch createBranch(@RequestBody OneToManyBiDBranch branch){
        return oneToManyBiDBankService.createBranch(branch);
    }

    @GetMapping("/get-branch-from-bank")
    public List<OneToManyBiDBank> getBranchFromBank(){
        return oneToManyBiDBankService.getBranchFromBank();
    }

    @GetMapping("/get-bank-from-branch")
    public List<OneToManyBiDBranch> getBanksFromBranch(){
        return oneToManyBiDBankService.getBanksUsingBranch();
    }




}
