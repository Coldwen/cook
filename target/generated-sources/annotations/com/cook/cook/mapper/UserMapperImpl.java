package com.cook.cook.mapper;

import com.cook.cook.dto.UserDto;
import com.cook.cook.entity.User;
import com.cook.cook.vo.UserVo;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-15T05:53:16+0800",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.2 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        return userDto;
    }

    @Override
    public UserVo toVo(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserVo userVo = new UserVo();

        return userVo;
    }
}
