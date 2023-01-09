package com.jpa.relationship.onetomany.parentTable.entity;

import com.jpa.relationship.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "om_p_bank_master")
@Data
public class OneToManyParentBank extends BaseEntity {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "bank_master_id")
    private Long id;


    private String bankName;
    private String bankCode;


    //this will have same behaviour
    //you can change the name as per your choice
    //create foreign key reference in the child (branch) table
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "bank_master_id",referencedColumnName = "bank_master_id")
    private List<OneToManyParentBranch> branch;

   /* @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "bank_master_id")
    private List<OneToManyParentBranch> branch;*/


    //this will create separate table that contains both tables primary key
   /* @OneToMany(cascade = CascadeType.ALL)
    private List<OneToManyParentBranch> branch;*/

}
