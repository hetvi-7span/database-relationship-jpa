package com.jpa.relationship.onetoone.biDirectional.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jpa.relationship.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "oo_b_user_details")
@Getter
@Setter
public class OneToOneBiDUserDetails extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "user_detail_id")
    private Long id;

    private String panCardNo;

    private String aadharCardNo;

    private LocalDate birthDate;


    @OneToOne(mappedBy = "userDetails")
    @JsonIgnore
    private OneToOneBiDUser user;

    @Override
    public String toString() {
        return "OneToOneBiDUserDetails{" +
                "id=" + id +
                ", panCardNo='" + panCardNo + '\'' +
                ", aadharCardNo='" + aadharCardNo + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
