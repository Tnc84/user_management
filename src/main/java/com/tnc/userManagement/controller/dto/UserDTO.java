package com.tnc.userManagement.controller.dto;

import java.util.Date;

public record UserDTO(
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
