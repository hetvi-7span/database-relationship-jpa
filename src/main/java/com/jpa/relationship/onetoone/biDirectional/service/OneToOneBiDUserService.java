package com.jpa.relationship.onetoone.biDirectional.service;


import com.jpa.relationship.onetoone.biDirectional.entity.OneToOneBiDUser;
import com.jpa.relationship.onetoone.biDirectional.entity.OneToOneBiDUserDetails;
import com.jpa.relationship.onetoone.biDirectional.repository.OneToOneBiDUserDetailsRepository;
import com.jpa.relationship.onetoone.biDirectional.repository.OneToOneBiDUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OneToOneBiDUserService {

    @Autowired
    OneToOneBiDUserRepository oneToOneBiDUserRepository;

    @Autowired
    OneToOneBiDUserDetailsRepository oneToOneBiDUserDetailsRepository;

    public OneToOneBiDUser createUser(OneToOneBiDUser user) {
        return  oneToOneBiDUserRepository.save(user);
    }

    public List<OneToOneBiDUser> getUsers(){
        //To access data using different objects

        List<OneToOneBiDUser> all = oneToOneBiDUserRepository.findAll();
        for (OneToOneBiDUser oneToOneBiDUser: all) {
            System.out.println("Child Table Data " +  oneToOneBiDUser.getUserDetails());
        }

        List<OneToOneBiDUserDetails> all1 = oneToOneBiDUserDetailsRepository.findAll();
        for (OneToOneBiDUserDetails oneToOneBiDUser: all1) {
            System.out.println("Master Table Data " + oneToOneBiDUser.getUser().getEmailAddress());

        }
        return oneToOneBiDUserRepository.findAll();
    }

}
