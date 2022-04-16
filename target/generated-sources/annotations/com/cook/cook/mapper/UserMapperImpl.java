package com.cook.cook.mapper;

import com.cook.cook.dto.UserDto;
import com.cook.cook.entity.User;
import com.cook.cook.vo.UserVo;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-16T14:18:42+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_281 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setUsername( user.getUsername() );
        userDto.setNickname( user.getNickname() );

        return userDto;
    }

    @Override
    public UserVo toVo(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserVo userVo = new UserVo();

        userVo.setId( userDto.getId() );
        userVo.setUsername( userDto.getUsername() );
        userVo.setNickname( userDto.getNickname() );

        return userVo;
    }
}
