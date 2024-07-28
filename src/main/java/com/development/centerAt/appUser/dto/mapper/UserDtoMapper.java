package com.development.centerAt.appUser.dto.mapper;

import com.development.centerAt.appUser.dto.AppUserDto;
import com.development.centerAt.appUser.model.AppUser;
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
