package com.jpa.relationship.onetoone.biDirectional.entity;

import com.jpa.relationship.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "oo_b_user_master")
@Getter
@Setter
public class OneToOneBiDUser extends BaseEntity {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "user_master_id")
    private Long id;


    private String firstName;
    private String lastName;

    private String mobileNo;

    private String emailAddress;

    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_detail_id",referencedColumnName = "user_detail_id")
    private OneToOneBiDUserDetails userDetails;

    @Override
    public String toString() {
        return "OneToOneBiDUser{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", userDetails=" + userDetails +
                '}';
    }
}
