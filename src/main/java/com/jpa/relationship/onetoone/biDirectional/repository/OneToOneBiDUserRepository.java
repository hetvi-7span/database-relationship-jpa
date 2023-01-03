package com.jpa.relationship.onetoone.biDirectional.repository;

import com.jpa.relationship.onetoone.biDirectional.entity.OneToOneBiDUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneToOneBiDUserRepository extends JpaRepository<OneToOneBiDUser,Long> {
}
