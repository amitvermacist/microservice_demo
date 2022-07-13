package com.demo.department.controller;

import com.demo.department.entity.DepEntity;
import com.demo.department.service.DepService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepController {
    @Autowired
    private DepService depService;

    //save dep
    @PostMapping("/")
    public DepEntity saveDep(DepEntity depEntity){
        log.info("save department");
        return  depService.saveDep(depEntity);
    }

    //get dep
    @GetMapping("/{id}")
    public DepEntity finDepByID(@PathVariable("id") Long DepID){
        log.info("get dep");
        return depService.findDepByID(DepID);
    }



}
