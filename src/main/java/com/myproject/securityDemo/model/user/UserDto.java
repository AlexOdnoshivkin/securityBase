package com.myproject.securityDemo.model.user;

import com.myproject.securityDemo.validation.PasswordMatches;
import com.myproject.securityDemo.validation.ValidEmail;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
@PasswordMatches
public class UserDto {
    @NotNull
    @NotEmpty
    private String firstName;

    @NotNull
    @NotEmpty
    private String lastName;

    @NotNull
    @NotEmpty
    private String password;

    @ValidEmail
    @NotNull
    @NotEmpty
    private String email;
}
