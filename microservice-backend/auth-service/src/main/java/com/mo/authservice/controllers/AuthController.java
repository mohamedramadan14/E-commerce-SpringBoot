package com.mo.authservice.controllers;

import com.mo.authservice.dtos.ApiResponseDto;
import com.mo.authservice.dtos.SignInRequestDto;
import com.mo.authservice.dtos.SignUpRequestDto;
import com.mo.authservice.exceptions.ServiceLogicException;
import com.mo.authservice.exceptions.UserAlreadyExistsException;
import com.mo.authservice.exceptions.UserNotFoundException;
import com.mo.authservice.exceptions.UserVerificationFailedException;
import com.mo.authservice.services.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;


@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    ResponseEntity<ApiResponseDto<?>> registerUser(@RequestBody @Valid SignUpRequestDto signUpRequestDto)
            throws UnsupportedEncodingException, UserAlreadyExistsException, ServiceLogicException{
        return authService.registerUser(signUpRequestDto);
    }

    @GetMapping("/signup/resend")
    ResponseEntity<ApiResponseDto<?>> resendVerificationCode(@RequestParam String email)
            throws UnsupportedEncodingException, UserNotFoundException, ServiceLogicException{
        return authService.resendVerificationCode(email);
    }

    @GetMapping("/signup/verify")
    ResponseEntity<ApiResponseDto<?>> verifyRegistrationVerification(@RequestParam String code)
            throws UserVerificationFailedException{
        return authService.verifyRegistrationVerification(code);
    }

    @PostMapping("/signin")
    ResponseEntity<ApiResponseDto<?>> authenticateUser(@RequestBody @Valid SignInRequestDto signInRequestDto){
        return authService.authenticateUser(signInRequestDto);
    }

    @GetMapping("/isValidToken")
    ResponseEntity<ApiResponseDto<?>> validateToken(@RequestParam String token){
        return authService.validateToken(token);
    }

}
