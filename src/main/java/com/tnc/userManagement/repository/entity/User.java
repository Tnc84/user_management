package com.tnc.userManagement.repository.entity;

import com.tnc.userManagement.service.model.RoleEnum;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
@Entity(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private Date lastLoginDate;
    private Date lastLoginDateDisplay;
    private Date joinDate;
    @Enumerated(EnumType.STRING)
    private RoleEnum role;
    @Transient
    private String[] authorities;
    private boolean isActive;
    private boolean isNotLocked;
}