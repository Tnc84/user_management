package com.tnc.userManagement.repository.entity;
/**
 * User
 * @author tnc
 */

import com.tnc.userManagement.service.constant.RoleEnum;
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

    /**
     * Long id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * String userId
     */
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
    private String[] authorities = new String[0];
    private boolean isActive;
    private boolean isNotLocked;
}