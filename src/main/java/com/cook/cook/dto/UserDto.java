package com.cook.cook.dto;

import com.cook.cook.enums.Gender;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserDto {
    private String id;

    private String username;

    private String nickname;

//    private List<RoleDto> roles;
}

