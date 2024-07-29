package com.mo.purely.services;

import com.mo.purely.dtos.responses.ApiResponseDto;
import com.mo.purely.dtos.requests.SignUpRequestDto;
import com.mo.purely.exceptions.ServiceLogicException;
import com.mo.purely.exceptions.UserAlreadyExistsException;
import com.mo.purely.exceptions.UserNotFoundException;
import com.mo.purely.exceptions.UserVerificationFailedException;
import jakarta.mail.MessagingException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public interface AuthService {
    ResponseEntity<ApiResponseDto<?>> save(SignUpRequestDto signUpRequestDto) throws MessagingException, UnsupportedEncodingException, UserAlreadyExistsException, ServiceLogicException;
    ResponseEntity<ApiResponseDto<?>> resendVerificationCode(String email) throws MessagingException, UnsupportedEncodingException, UserNotFoundException, ServiceLogicException;

    ResponseEntity<ApiResponseDto<?>> verifyRegistrationVerification(String code) throws UserVerificationFailedException;

}
