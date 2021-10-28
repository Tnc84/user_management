package com.tnc.userManagement.entities;

import lombok.Getter;

public enum Authority {
    USER_AUTHORITIES("user:read"),
    ADMIN_AUTHORITIES("user:read", "user:write"),
    MANAGER_AUTHORITIES("user:read", "user:write", "user:delete"),
    OWNER_AUTHORITIES("user:read", "user:write", "user:delete");

    @Getter
    private final String wrights;
    @Getter
    private String secondWrights;
    @Getter
    private String thirdWrights;

    Authority(String wrights) {
        this.wrights = wrights;
    }

    Authority(String wrights, String secondWrights) {
        this.wrights = wrights;
        this.secondWrights = secondWrights;
    }

    Authority(String wrights, String secondWrights, String thirdWrights) {
        this.wrights = wrights;
        this.secondWrights = secondWrights;
        this.thirdWrights = thirdWrights;
    }
}
