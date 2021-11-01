package com.tnc.userManagement.service.model;

import lombok.Getter;

import static com.tnc.userManagement.service.model.AuthorityEnum.*;

public enum RoleEnum {

    ROLE_USER(String.valueOf(USER_AUTHORITIES)),
    ROLE_ADMIN(String.valueOf(ADMIN_AUTHORITIES)),
    ROLE_MANAGER(String.valueOf(MANAGER_AUTHORITIES)),
    ROLE_OWNER(String.valueOf(OWNER_AUTHORITIES));

    @Getter
    private String[] authorities;

    RoleEnum(String... authorities) {
        this.authorities = authorities;
    }
}
