package com.mo.productservice.services;

import com.mo.productservice.dtos.ApiResponseDto;
import com.mo.productservice.dtos.ProductRequestDto;
import com.mo.productservice.exceptions.ResourceNotFoundException;
import com.mo.productservice.exceptions.ServiceLogicException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public interface ProductService {
    ResponseEntity<ApiResponseDto<?>> addProduct(ProductRequestDto requestDto) throws ServiceLogicException, ResourceNotFoundException;

    ResponseEntity<ApiResponseDto<?>> getAllProducts() throws ServiceLogicException;

    ResponseEntity<ApiResponseDto<?>> getProductById(String productId) throws ServiceLogicException;

    ResponseEntity<ApiResponseDto<?>> getProductByCategory(String categoryId) throws ServiceLogicException, ResourceNotFoundException;

    ResponseEntity<ApiResponseDto<?>> searchProducts(String searchKey) throws ServiceLogicException;

    ResponseEntity<ApiResponseDto<?>> editProduct(String productId, ProductRequestDto requestDto) throws ServiceLogicException, ResourceNotFoundException;
}
