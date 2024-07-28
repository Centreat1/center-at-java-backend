package com.development.centerAt.appUser.service;

import com.development.centerAt.appUser.dto.mapper.UserDtoMapper;
import com.development.centerAt.appUser.repository.AppUserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AppUserServiceImplTest {

    @Mock
    private AppUserRepository appUserRepository;

    @Mock
    private UserDtoMapper userDtoMapper;

    @InjectMocks
    private AppUserServiceImpl appUserService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void addAppUser() {
        /*when(userDtoMapper.userDtoToAppUser()).thenReturn();
        when(appUserRepository.save()).thenReturn();
        when(appUserRepository.save()).thenThrow(new Exception(qe));


        appUserService.addAppUser();

        assertEquals( , , );
        verify(appUserRepository, times(1)).save();

        verifyNoMoreInteractions(userDtoMapper, appUserRepository);*/
    }

    @Test
    void findAppUserByUsername() {
    }

    @Test
    void getUsers() {
    }
}