package com.tnc.userManagement.service.ServiceImpl;

import com.tnc.userManagement.repository.UserRepository;
import com.tnc.userManagement.service.IUserService;
import com.tnc.userManagement.service.mapper.UserDomainMapper;
import com.tnc.userManagement.service.model.UserDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private UserRepository userRepository;
    private UserDomainMapper userDomainMapper;

    @Override
    public UserDomain login(UserDomain userDomain) {
        return null;
    }

    @Override
    public UserDomain register(String firstName, String lastName, String username, String email) {
        return null;
    }

    @Override
    public UserDomain findByUsername(String username) {
        return null;
    }

    @Override
    public UserDomain findByEmail(String email) {
        return null;
    }

    @Override
    public UserDomain addNewUserWithSpecificRole(String firstName, String laseName, String username, String email, String role, boolean isActive, boolean isNotActive, MultipartFile profileImage) {
        return null;
    }

    @Override
    public UserDomain updateUser(String currentUsername, String newFirstName, String newLaseName, String newUsername, String newEmail, String role, boolean isActive, boolean isNotActive, MultipartFile profileImage) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public List<UserDomain> getAll() {
        return null;
    }
}
