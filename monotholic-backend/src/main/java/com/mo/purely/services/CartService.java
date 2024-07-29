package com.mo.purely.services;

import com.mo.purely.dtos.responses.ApiResponseDto;
import com.mo.purely.dtos.requests.CartItemRequestDto;
import com.mo.purely.exceptions.ProductNotFoundException;
import com.mo.purely.exceptions.ServiceLogicException;
import com.mo.purely.exceptions.UserNotFoundException;
import org.springframework.http.ResponseEntity;

public interface CartService {
    ResponseEntity<ApiResponseDto<?>> addItemToCart(CartItemRequestDto requestDto) throws UserNotFoundException, ServiceLogicException, ProductNotFoundException;

    ResponseEntity<ApiResponseDto<?>> getCartItemsByUser(String userId) throws UserNotFoundException, ServiceLogicException;

    ResponseEntity<ApiResponseDto<?>> removeCartItemFromCart(String userId, String productId) throws ServiceLogicException;

}
