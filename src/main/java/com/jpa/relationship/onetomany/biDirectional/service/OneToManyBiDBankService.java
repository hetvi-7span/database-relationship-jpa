package com.jpa.relationship.onetomany.biDirectional.service;


import com.jpa.relationship.onetomany.biDirectional.entity.OneToManyBiDBank;
import com.jpa.relationship.onetomany.biDirectional.entity.OneToManyBiDBranch;
import com.jpa.relationship.onetomany.biDirectional.repository.OneToManyBiDBankRepository;
import com.jpa.relationship.onetomany.biDirectional.repository.OneToManyBiDBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OneToManyBiDBankService {

    @Autowired
    OneToManyBiDBankRepository oneToManyBiDBankRepository;

    @Autowired
    OneToManyBiDBranchRepository oneToManyBiDBranchRepository;


    public OneToManyBiDBank createBank(OneToManyBiDBank bank) {
        return  oneToManyBiDBankRepository.save(bank);
    }

    public List<OneToManyBiDBank> getBranchFromBank(){
        return oneToManyBiDBankRepository.findAll();
    }

    public List<OneToManyBiDBranch> getBanksUsingBranch() {
        return oneToManyBiDBranchRepository.findAll();
    }

    public OneToManyBiDBranch createBranch(OneToManyBiDBranch branch) {
        return oneToManyBiDBranchRepository.save(branch);
    }
}
