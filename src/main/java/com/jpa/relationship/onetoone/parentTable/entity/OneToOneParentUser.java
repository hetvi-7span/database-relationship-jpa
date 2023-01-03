package com.jpa.relationship.onetoone.parentTable.entity;

import com.jpa.relationship.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "oo_p_user_master")
@Data
public class OneToOneParentUser extends BaseEntity {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "user_master_id")
    private Long id;


    private String firstName;
    private String lastName;

    private String mobileNo;

    private String emailAddress;

    private String password;


    //to add user_details table id in user_master table
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_detail_id",referencedColumnName = "user_detail_id")
    private OneToOneParentUserDetails userDetails;
}
