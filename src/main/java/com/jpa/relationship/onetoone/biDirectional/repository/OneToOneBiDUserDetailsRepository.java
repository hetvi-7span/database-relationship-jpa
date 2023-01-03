package com.jpa.relationship.onetoone.biDirectional.repository;

import com.jpa.relationship.onetoone.biDirectional.entity.OneToOneBiDUserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneToOneBiDUserDetailsRepository extends JpaRepository<OneToOneBiDUserDetails,Long> {
}
