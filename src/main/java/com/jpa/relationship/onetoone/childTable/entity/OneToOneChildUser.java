package com.jpa.relationship.onetoone.childTable.entity;

import com.jpa.relationship.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "oo_c_user_master")
@Data
public class OneToOneChildUser extends BaseEntity {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "user_master_id")
    private Long id;


    private String firstName;
    private String lastName;

    private String mobileNo;

    private String emailAddress;

    private String password;

}
