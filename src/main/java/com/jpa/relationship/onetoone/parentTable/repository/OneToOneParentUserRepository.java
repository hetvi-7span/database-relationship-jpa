package com.jpa.relationship.onetoone.parentTable.repository;

import com.jpa.relationship.onetoone.parentTable.entity.OneToOneParentUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneToOneParentUserRepository extends JpaRepository<OneToOneParentUser,Long> {
}
