package com.development.centerAt.AppUser.service.interfaces;

import com.development.centerAt.AppUser.dto.AppUserDto;
import com.development.centerAt.AppUser.model.AppUser;

import java.util.Optional;

public interface AppUserService {
    AppUser addAppUser(AppUserDto appUserDto);

    Optional<AppUser> findAppUserByUsername(String username);
}
