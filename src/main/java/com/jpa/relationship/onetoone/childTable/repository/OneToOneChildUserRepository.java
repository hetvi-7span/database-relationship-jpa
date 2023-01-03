package com.jpa.relationship.onetoone.childTable.repository;

import com.jpa.relationship.onetoone.childTable.entity.OneToOneChildUserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneToOneChildUserRepository extends JpaRepository<OneToOneChildUserDetails,Long> {
}
