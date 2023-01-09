package com.jpa.relationship.onetomany.biDirectional.repository;

import com.jpa.relationship.onetomany.biDirectional.entity.OneToManyBiDBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneToManyBiDBranchRepository extends JpaRepository<OneToManyBiDBranch,Long> {
}
