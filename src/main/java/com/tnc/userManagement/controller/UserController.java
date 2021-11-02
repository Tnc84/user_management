package com.tnc.userManagement.controller;

import com.tnc.userManagement.controller.dto.UserDTO;
import com.tnc.userManagement.controller.dtoMapper.UserDTOMapper;
import com.tnc.userManagement.service.IUserService;
import com.tnc.userManagement.service.exception.EmailExistException;
import com.tnc.userManagement.service.exception.EmailNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = {"/", "/user"})
public class UserController {
    private final IUserService userService;
    private final UserDTOMapper userDTOMapper;

    @GetMapping("/list")
    public ResponseEntity<List<UserDTO>> getAllUser() {
        return ResponseEntity.ok(userDTOMapper.toDTOList(userService.getAll()));
    }

    @GetMapping("/register")
    public ResponseEntity<UserDTO> registerUser(@RequestBody UserDTO userDTO) throws EmailNotFoundException, EmailExistException {
        return ResponseEntity.ok(userDTOMapper.toDTO(userService.register(userDTO.firstName(), userDTO.lastName(), userDTO.email())));
    }
}
