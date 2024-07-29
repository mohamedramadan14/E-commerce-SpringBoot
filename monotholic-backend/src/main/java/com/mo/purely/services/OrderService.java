package com.mo.purely.services;

import com.mo.purely.dtos.responses.ApiResponseDto;
import com.mo.purely.dtos.requests.OrderRequestDto;
import com.mo.purely.exceptions.CartNotFoundException;
import com.mo.purely.exceptions.OrderNotFoundException;
import com.mo.purely.exceptions.ServiceLogicException;
import com.mo.purely.exceptions.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    ResponseEntity<ApiResponseDto<?>> createOrder(OrderRequestDto request) throws UserNotFoundException, ServiceLogicException, CartNotFoundException;

    ResponseEntity<ApiResponseDto<?>> getOrdersByUser(String userId) throws UserNotFoundException, ServiceLogicException;

    ResponseEntity<ApiResponseDto<?>> cancelOrder(String orderId) throws ServiceLogicException, OrderNotFoundException;
}
