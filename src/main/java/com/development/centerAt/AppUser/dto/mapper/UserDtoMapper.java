package com.development.centerAt.AppUser.dto.mapper;

import com.development.centerAt.AppUser.dto.AppUserDto;
import com.development.centerAt.AppUser.model.AppUser;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class UserDtoMapper {
    public AppUser userDtoToAppUser(AppUserDto appUserDto) {
        return AppUser.builder()
                .email(appUserDto.getEmail())
                .username(appUserDto.getUsername())
                .password(appUserDto.getPassword())
                .firstName(appUserDto.getFirstName())
                .lastName(appUserDto.getLastName())
                .role(appUserDto.getRole())
                .createdOn(LocalDateTime.now())
                .build();
    }
}
