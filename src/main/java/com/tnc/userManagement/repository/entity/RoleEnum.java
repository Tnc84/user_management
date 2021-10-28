package com.tnc.userManagement.repository.entity;

import lombok.Getter;

import static com.tnc.userManagement.repository.entity.AuthorityEnum.*;

public enum RoleEnum {

    ROLE_USER(USER_AUTHORITIES),
    ROLE_ADMIN(ADMIN_AUTHORITIES),
    ROLE_MANAGER(MANAGER_AUTHORITIES),
    ROLE_OWNER(OWNER_AUTHORITIES);

    @Getter
    private String[] authorities;

    RoleEnum(String... authorities) {
        this.authorities = authorities;
    }
}
