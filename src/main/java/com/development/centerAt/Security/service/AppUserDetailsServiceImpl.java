package com.development.centerAt.Security.service;

import com.development.centerAt.AppUser.model.AppUser;
import com.development.centerAt.AppUser.repository.AppUserRepository;
import com.development.centerAt.Security.model.AppUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AppUserDetailsServiceImpl implements UserDetailsService {
    private final AppUserRepository appUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUser> user = appUserRepository.findUserByUsername(username);
        if (user.isEmpty()) {
            throw new UsernameNotFoundException(String.format("User with username %s not found", username));
        }
        AppUser loadedUser = user.get();
        return new AppUserDetails(loadedUser);
    }
}
