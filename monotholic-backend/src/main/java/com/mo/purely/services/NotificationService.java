package com.mo.purely.services;

import com.mo.purely.modals.Order;
import com.mo.purely.modals.User;
import jakarta.mail.MessagingException;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public interface NotificationService {

    void sendUserRegistrationVerificationEmail(User user) throws MessagingException, UnsupportedEncodingException;

    void sendForgotPasswordVerificationEmail(User user) throws MessagingException, UnsupportedEncodingException;

    void sendOrderConfirmationEmail(User user, Order order) throws MessagingException, UnsupportedEncodingException;
}
