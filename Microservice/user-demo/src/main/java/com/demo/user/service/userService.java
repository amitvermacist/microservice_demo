package com.demo.user.service;

import com.demo.user.ValueObj.DepEntity;
import com.demo.user.ValueObj.ResponseTemp;
import com.demo.user.entity.user;
import com.demo.user.repo.userRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class userService {
    @Autowired
    private userRepo user_repo;

    @Autowired
    private RestTemplate restTemplate;

    public user saveUser(user users) {
        log.info("inside the save uer----");
        return  userRepo.save(users);
    }

    public static ResponseTemp getUserWithDep(Long userID) {
        log.info("get dep form dep service");
        ResponseTemp rt=new ResponseTemp();
        user users= userRepo.findByUserID(userID);
        //get dep info from other dep service
        DepEntity depEntity=restTemplate.getForObject("http://localhost:9001/dep"+users.getDepID()
                ,DepEntity.class);
        //set user and dep in VO
        rt.setUsers(users);
        rt.setDepEntity(depEntity);
        return  rt;
        return  rt;

    }
}

