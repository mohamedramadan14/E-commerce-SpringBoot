package com.mo.userservice.controllers;

import com.mo.userservice.dtos.ApiResponseDto;
import com.mo.userservice.exceptions.ServiceLogicException;
import com.mo.userservice.exceptions.UserNotFoundException;
import com.mo.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/exists/byId")
    public ResponseEntity<ApiResponseDto<?>> existsUserById(@RequestParam String userId) throws ServiceLogicException{
        return userService.existsUserById(userId);
    }

    @GetMapping("/get/byId")
    ResponseEntity<ApiResponseDto<?>> getUserById(@RequestParam String id) throws UserNotFoundException, ServiceLogicException {
        return userService.getUserById(id);
    }


}

