package com.development.centerAt.AppUser.dto;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AppUserDto {

    @NotBlank
    @Size(max = 250, message = "Максимальное количество символов в логине - 250, " +
            "пожалуйста, проверьте правильность указанных данных")
    private String username;

    @NotBlank
    @Size(max = 250, message = "Максимальное количество символов в пароле - 250, " +
            "пожалуйста, проверьте правильность указанных данных")
    private String password;

    @Email
    @NotBlank
    @Size(min = 6, max = 254, message = "Минимальное количество символов в электронной почте пользователя - 6, " +
            "максимальное - 254, пожалуйста, проверьте правильность указанных данных")
    private String email;

    @NotBlank
    @Size(max = 250, message = "Максимальное количество символов в имени - 250, " +
            "пожалуйста, проверьте правильность указанных данных")
    private String firstName;

    @NotBlank
    @Size(max = 250, message = "Максимальное количество символов в фамилии - 250, " +
            "пожалуйста, проверьте правильность указанных данных")
    private String lastName;

    @Nullable
    private String role;
}
