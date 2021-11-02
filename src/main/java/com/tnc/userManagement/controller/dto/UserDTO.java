package com.tnc.userManagement.controller.dto;

import com.tnc.userManagement.service.validation.OnCreate;
import com.tnc.userManagement.service.validation.OnUpdate;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.util.Date;

@Validated
public record UserDTO(

        @Null(message = "Id must be null", groups = OnCreate.class)
        @NotNull(message = "Id must not be null", groups = OnUpdate.class)
        @Positive
        Long id,
        String userId,
        String firstName,
        String lastName,
        String email,
        String phone,
        String password,
        Date lastLoginDate,
        Date lastLoginDateDisplay,
        Date joinDate,
        String role,
        String[] authorities,
        boolean isActive,
        boolean isNotLocked
) {
}
