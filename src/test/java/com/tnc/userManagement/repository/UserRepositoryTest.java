package com.tnc.userManagement.repository;

import com.tnc.userManagement.repository.entity.User;
import com.tnc.userManagement.service.constant.RoleEnum;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;

import static com.tnc.userManagement.service.constant.AuthorityEnum.ADMIN_AUTHORITIES;
import static com.tnc.userManagement.service.constant.AuthorityEnum.MANAGER_AUTHORITIES;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepositoryTest;

    @Test
    void findUserByEmail() {
        String userEmailTest = "tncbogdan@gmail.com";
        var buildUser =User.builder()
                .id(1L)
                .userId("s324")
                .firstName("Marky")
                .lastName("Lilia")
//                .email(String.valueOf(userRepositoryTest.findUserByEmail(userEmailTest)))
                .email(userEmailTest)
                .phone("0123456789")
                .password("password")
                .lastLoginDate(new Date())
                .lastLoginDateDisplay(new Date())
                .joinDate(new Date())
                .role(RoleEnum.ROLE_ADMIN)
                .authorities(new String[0])
                .isActive(false)
                .isNotLocked(false)
                .build();
        userRepositoryTest.save(buildUser);

        var expect = userRepositoryTest.findUserByEmail(userEmailTest);

        assertThat(buildUser.getEmail()).isEqualTo(userEmailTest);
    }

    @Test
    void checkUserEmailDoesNotExist() {
        String userEmailTest = "tncbogdan@gmail.com";
        var buildUser =User.builder()
                .id(1L)
                .userId("s324")
                .firstName("Marky")
                .lastName("Lilia")
//                .email(String.valueOf(userRepositoryTest.findUserByEmail(userEmailTest)))
                .email(userEmailTest)
                .phone("0123456789")
                .password("password")
                .lastLoginDate(new Date())
                .lastLoginDateDisplay(new Date())
                .joinDate(new Date())
                .role(RoleEnum.ROLE_ADMIN)
                .authorities(new String[0])
                .isActive(false)
                .isNotLocked(false)
                .build();
        userRepositoryTest.save(buildUser);

        assertThat(buildUser.getEmail()).isNotEqualTo(userEmailTest);
    }
}