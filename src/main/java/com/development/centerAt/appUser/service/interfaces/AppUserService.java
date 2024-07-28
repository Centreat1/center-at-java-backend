package com.development.centerAt.appUser.service.interfaces;

import com.development.centerAt.appUser.dto.AppUserDto;
import com.development.centerAt.appUser.model.AppUser;

import java.util.List;
import java.util.Optional;

public interface AppUserService {
    AppUser addAppUser(AppUserDto appUserDto);

    Optional<AppUser> findAppUserByUsername(String username);

    List<AppUser> getUsers();
}
