package com.mo.userservice.services;

import com.mo.userservice.dtos.ApiResponseDto;
import com.mo.userservice.exceptions.ServiceLogicException;
import com.mo.userservice.exceptions.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
    ResponseEntity<ApiResponseDto<?>> existsUserById(String userId) throws ServiceLogicException;

    ResponseEntity<ApiResponseDto<?>> getUserById(String id) throws ServiceLogicException, UserNotFoundException;
}
