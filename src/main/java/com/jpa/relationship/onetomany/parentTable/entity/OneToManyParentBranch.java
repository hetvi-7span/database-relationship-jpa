package com.jpa.relationship.onetomany.parentTable.entity;

import com.jpa.relationship.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "om_p_branch_master")
@Data
public class OneToManyParentBranch extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "branch_master_id")
    private Long id;

    private String branchName;

    private String branchCode;

    private String address;

    private String ifscCode;

    private String micrCode;

}
