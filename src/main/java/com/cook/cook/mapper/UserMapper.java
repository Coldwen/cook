package com.cook.cook.mapper;

import com.cook.cook.dto.UserDto;
import com.cook.cook.entity.User;
import com.cook.cook.vo.UserVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    UserDto toDto(User user);

    UserVo toVo(UserDto userDto);

}
