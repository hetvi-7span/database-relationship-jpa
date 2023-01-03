package com.jpa.relationship.onetoone.childTable.service;

import com.jpa.relationship.onetoone.childTable.entity.OneToOneChildUserDetails;
import com.jpa.relationship.onetoone.childTable.repository.OneToOneChildUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OneToOneChildUserService {

    @Autowired
    OneToOneChildUserRepository oneToOneChildUserRepository;

    public OneToOneChildUserDetails createUser(OneToOneChildUserDetails user) {
        return  oneToOneChildUserRepository.save(user);
    }

    public List<OneToOneChildUserDetails> getUsers(){
        return oneToOneChildUserRepository.findAll();
    }

}
