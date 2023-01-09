package com.jpa.relationship.onetomany.biDirectional.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.jpa.relationship.entity.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "om_b_branch_master")
@Getter
@Setter
public class OneToManyBiDBranch extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "branch_master_id")
    private Long id;

    private String branchName;

    private String branchCode;

    private String address;

    private String ifscCode;

    private String micrCode;

    //to get name of column as bank_id
    // JsonBackReference is used to mark child object
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "bank_id")
    private OneToManyBiDBank bank;


    //hibernate generate default name as column name
   /* @ManyToOne(cascade = CascadeType.ALL)
    private OneToManyBiDBank bank;*/
}
