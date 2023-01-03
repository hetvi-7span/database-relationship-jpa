package com.jpa.relationship.onetoone.parentTable.service;


import com.jpa.relationship.onetoone.parentTable.entity.OneToOneParentUser;
import com.jpa.relationship.onetoone.parentTable.repository.OneToOneParentUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OneToOneParentUserService {

    @Autowired
    OneToOneParentUserRepository oneToOneParentUserRepository;

    public OneToOneParentUser createUser(OneToOneParentUser user) {
        return  oneToOneParentUserRepository.save(user);
    }

    public List<OneToOneParentUser> getUsers(){
        return oneToOneParentUserRepository.findAll();
    }

}
