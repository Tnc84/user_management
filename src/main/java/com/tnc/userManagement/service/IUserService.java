package com.tnc.userManagement.service;

import com.tnc.userManagement.service.exception.EmailExistException;
import com.tnc.userManagement.service.exception.EmailNotFoundException;
import com.tnc.userManagement.service.model.UserDomain;
import com.tnc.userManagement.service.security.UserPrincipal;
import org.springframework.http.HttpHeaders;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;

public interface IUserService {

    UserDomain login(UserDomain userDomain);

    UserDomain register(String firstName, String lastName, String email) throws EmailNotFoundException, EmailExistException, MessagingException;

    void resetPassword(String email) throws MessagingException, EmailNotFoundException;

    UserDomain findByEmail(String email);

    UserDomain addNewUserWithSpecificRole(String firstName, String laseName, String email, String role, boolean isActive, boolean isNotActive) throws IOException;

    UserDomain updateUser(String currentEmail, String newFirstName, String newLaseName, String newEmail, String role, boolean isActive, boolean isNotActive) throws EmailNotFoundException, EmailExistException;

    UserDomain get(Long id);

    void deleteUser(Long id);

    List<UserDomain> getAll();

    HttpHeaders getJwtHeader(UserPrincipal userPrincipal);
}
