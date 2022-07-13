package com.demo.department.repo;

import com.demo.department.entity.DepEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepRepo extends JpaRepository<DepEntity, Long> {

    DepEntity findByDepID(Long depID);
}
