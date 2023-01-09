package com.jpa.relationship.onetomany.biDirectional.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.jpa.relationship.entity.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "om_b_bank_master")
@Getter
@Setter
public class OneToManyBiDBank extends BaseEntity {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "bank_master_id")
    private Long id;


    private String bankName;
    private String bankCode;



    //to add branch_master table id in bank_master table
    //JsonManagedReference is used to refer to parent object
    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "bank")
    private List<OneToManyBiDBranch> branch;


}
