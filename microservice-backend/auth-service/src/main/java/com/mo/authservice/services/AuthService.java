package com.mo.authservice.services;

import com.mo.authservice.dtos.ApiResponseDto;
import com.mo.authservice.dtos.SignInRequestDto;
import com.mo.authservice.dtos.SignUpRequestDto;
import com.mo.authservice.exceptions.ServiceLogicException;
import com.mo.authservice.exceptions.UserAlreadyExistsException;
import com.mo.authservice.exceptions.UserNotFoundException;
import com.mo.authservice.exceptions.UserVerificationFailedException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public interface AuthService {
    ResponseEntity<ApiResponseDto<?>> registerUser(SignUpRequestDto signUpRequestDto) throws UnsupportedEncodingException, UserAlreadyExistsException, ServiceLogicException;
    ResponseEntity<ApiResponseDto<?>> resendVerificationCode(String email) throws UnsupportedEncodingException, UserNotFoundException, ServiceLogicException;
    ResponseEntity<ApiResponseDto<?>> verifyRegistrationVerification(String code) throws UserVerificationFailedException;
    ResponseEntity<ApiResponseDto<?>> authenticateUser(SignInRequestDto signInRequestDto);
    ResponseEntity<ApiResponseDto<?>> validateToken(String token);
}
