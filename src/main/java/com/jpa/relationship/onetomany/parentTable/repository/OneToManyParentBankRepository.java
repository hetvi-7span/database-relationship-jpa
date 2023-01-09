package com.jpa.relationship.onetomany.parentTable.repository;

import com.jpa.relationship.onetomany.parentTable.entity.OneToManyParentBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneToManyParentBankRepository extends JpaRepository<OneToManyParentBank,Long> {
}
