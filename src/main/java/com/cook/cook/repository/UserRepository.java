package com.cook.cook.repository;

import com.cook.cook.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
//    List<User> findByUsername(String username);
    User getByUsername(String username);
}
