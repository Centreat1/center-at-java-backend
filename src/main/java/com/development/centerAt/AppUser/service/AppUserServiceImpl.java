package com.development.centerAt.AppUser.service;

import com.development.centerAt.AppUser.dto.AppUserDto;
import com.development.centerAt.AppUser.dto.mapper.UserDtoMapper;
import com.development.centerAt.AppUser.model.AppUser;
import com.development.centerAt.AppUser.repository.AppUserRepository;
import com.development.centerAt.AppUser.service.interfaces.AppUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AppUserServiceImpl implements AppUserService {
    private final AppUserRepository appUserRepository;
    private final UserDtoMapper userDtoMapper;

    @Transactional
    @Override
    public AppUser addAppUser(AppUserDto appUserDto) {
        //доп валидация что нет таких имен, почты и так далее
        AppUser appUser = userDtoMapper.userDtoToAppUser(appUserDto);
        return appUserRepository.save(appUser);
    }

    @Override
    public Optional<AppUser> findAppUserByUsername(String username) {
        return appUserRepository.findUserByUsername(username);
    }
}
