package com.mo.purely.controllers;

import com.mo.purely.dtos.responses.ApiResponseDto;
import com.mo.purely.dtos.requests.OrderRequestDto;
import com.mo.purely.exceptions.CartNotFoundException;
import com.mo.purely.exceptions.OrderNotFoundException;
import com.mo.purely.exceptions.ServiceLogicException;
import com.mo.purely.exceptions.UserNotFoundException;
import com.mo.purely.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purely/order")
@CrossOrigin(origins = "http://localhost:5173")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    @PreAuthorize("hasRole('ROLE_USER')")
    ResponseEntity<ApiResponseDto<?>> createOrder(@RequestBody OrderRequestDto request) throws UserNotFoundException, ServiceLogicException, CartNotFoundException{
        return orderService.createOrder(request);
    }

    @GetMapping("/get/byUser")
    @PreAuthorize("hasRole('ROLE_USER')")
    ResponseEntity<ApiResponseDto<?>> getOrdersByUser(@RequestParam String userId) throws UserNotFoundException, ServiceLogicException{
        return orderService.getOrdersByUser(userId);
    }

    @PatchMapping("/cancel")
    ResponseEntity<ApiResponseDto<?>> cancelOrder(@RequestParam String orderId) throws ServiceLogicException, OrderNotFoundException{
        return orderService.cancelOrder(orderId);
    }


}
