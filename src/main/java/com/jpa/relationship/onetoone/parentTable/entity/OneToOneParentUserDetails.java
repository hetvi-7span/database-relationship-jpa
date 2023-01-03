package com.jpa.relationship.onetoone.parentTable.entity;

import com.jpa.relationship.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "oo_p_user_details")
@Data
public class OneToOneParentUserDetails extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "user_detail_id")
    private Long id;

    private String panCardNo;

    private String aadharCardNo;

    private LocalDate birthDate;

}
