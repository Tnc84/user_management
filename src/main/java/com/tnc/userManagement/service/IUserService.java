package com.tnc.userManagement.service;

import com.tnc.userManagement.service.model.UserDomain;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface IUserService {

    UserDomain login(UserDomain userDomain);

    UserDomain register(String firstName, String lastName, String username, String email);

    UserDomain findByUsername(String username);

    UserDomain findByEmail(String email);

    UserDomain addNewUserWithSpecificRole(String firstName, String laseName, String username, String email, String role, boolean isActive, boolean isNotActive, MultipartFile profileImage) throws IOException;

    UserDomain updateUser(String currentUsername, String newFirstName, String newLaseName, String newUsername, String newEmail, String role, boolean isActive, boolean isNotActive, MultipartFile profileImage);

    void deleteUser(Long id);

    List<UserDomain> getAll();

}
