package com.cook.cook.service;

import com.cook.cook.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<UserDto> list();
}
