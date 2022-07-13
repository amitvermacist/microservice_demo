package com.demo.user.repo;

import com.demo.user.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<user, Long> {
    static user findByUserID(Long userID) {
    }
}
