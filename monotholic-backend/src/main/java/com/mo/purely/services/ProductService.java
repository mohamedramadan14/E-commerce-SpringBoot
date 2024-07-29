package com.mo.purely.services;

import com.mo.purely.dtos.responses.ApiResponseDto;
import com.mo.purely.dtos.requests.ProductRequestDto;
import com.mo.purely.exceptions.ProductNotFoundException;
import com.mo.purely.exceptions.ServiceLogicException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public interface ProductService {
    ResponseEntity<ApiResponseDto<?>> addProduct(ProductRequestDto requestDto) throws ServiceLogicException;

    ResponseEntity<ApiResponseDto<?>> getAllProducts() throws ServiceLogicException;

    ResponseEntity<ApiResponseDto<?>> getProductById(String productId) throws ServiceLogicException, ProductNotFoundException;

    ResponseEntity<ApiResponseDto<?>> getProductByCategory(String categoryId) throws ServiceLogicException;

    ResponseEntity<ApiResponseDto<?>> searchProducts(String searchKey) throws ServiceLogicException;

}
