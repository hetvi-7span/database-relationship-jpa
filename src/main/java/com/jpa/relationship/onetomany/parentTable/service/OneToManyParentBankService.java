package com.jpa.relationship.onetomany.parentTable.service;


import com.jpa.relationship.onetomany.parentTable.entity.OneToManyParentBank;
import com.jpa.relationship.onetomany.parentTable.repository.OneToManyParentBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OneToManyParentBankService {

    @Autowired
    OneToManyParentBankRepository oneToManyParentBankRepository;

    public OneToManyParentBank createBank(OneToManyParentBank user) {
        return  oneToManyParentBankRepository.save(user);
    }

    public List<OneToManyParentBank> getBanks(){
        return oneToManyParentBankRepository.findAll();
    }

}
