package com.tnc.userManagement.repository.entity;

public class AuthorityEnum {
    public static final String[] USER_AUTHORITIES = {"user:read"};
    public static final String[] ADMIN_AUTHORITIES = {"user:read", "user:write"};
    public static final String[] MANAGER_AUTHORITIES = {"user:read", "user:write", "user:update"};
    public static final String[] OWNER_AUTHORITIES = {"user:read", "user:write", "user:update", "user:delete"};
}
