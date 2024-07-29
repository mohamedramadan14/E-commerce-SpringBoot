package com.mo.notificationservice.services;

import com.mo.notificationservice.dtos.ApiResponseDto;
import com.mo.notificationservice.dtos.MailRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface NotificationService {
    ResponseEntity<ApiResponseDto<?>> sendEmail(MailRequestDto requestDto);
}
