package com.jpa.relationship.onetoone.childTable.entity;

import com.jpa.relationship.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "oo_c_user_details")
@Data
public class OneToOneChildUserDetails extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "user_detail_id")
    private Long id;

    private String panCardNo;

    private String aadharCardNo;

    private LocalDate birthDate;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_master_id",referencedColumnName = "user_master_id")
    private OneToOneChildUser userDetails;

}
