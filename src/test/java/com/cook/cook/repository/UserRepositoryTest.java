package com.cook.cook.repository;

import com.cook.cook.entity.User;
import com.cook.cook.enums.Gender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Test
    void findByUsername() {
        User user = new User();
        user.setUsername("小黄");
        user.setNickname("黄黄");
        user.setEnabled(true);
        user.setLocked(false);
        user.setPassword("123456");
        user.setGender(Gender.FEMALE);
        user.setLastLoginIp("127.0.0.1");
        user.setLastLoginTime(new Date());

        User savedUser = repository.save(user);
        User result =repository.getByUsername("hhh");
        System.out.println(result.toString());
    }
}