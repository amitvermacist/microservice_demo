package com.demo.department.service;

import com.demo.department.entity.DepEntity;
import com.demo.department.repo.DepRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepService {
    @Autowired
    private DepRepo depRepo;

    public DepEntity saveDep(DepEntity depEntity) {
        log.info("save dep");
        return  depRepo.save(depEntity);
    }

    public DepEntity findDepByID(Long depID) {
        log.info("find dep by id");
        return depRepo.findByDepID(depID);

    }
}
