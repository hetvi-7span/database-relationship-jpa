package com.jpa.relationship.onetomany.biDirectional.repository;

import com.jpa.relationship.onetomany.biDirectional.entity.OneToManyBiDBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneToManyBiDBankRepository extends JpaRepository<OneToManyBiDBank,Long> {
}
