package com.tnc.userManagement.controller.dto;

import com.tnc.userManagement.service.validation.OnCreate;
import com.tnc.userManagement.service.validation.OnUpdate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

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
