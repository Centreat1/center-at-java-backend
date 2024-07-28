package com.development.centerAt.appUser.controller;

import com.development.centerAt.appUser.model.AppUser;
import com.development.centerAt.appUser.service.interfaces.AppUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/user")
public class AppUserController {


    private final AppUserService appUserService;

    @GetMapping
    public ResponseEntity<List<AppUser>> getUsers() {
        return new ResponseEntity<>(appUserService.getUsers(), HttpStatus.OK);
    }




}
