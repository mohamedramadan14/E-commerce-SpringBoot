package com.mo.productservice.controllers;

import com.mo.productservice.dtos.ApiResponseDto;
import com.mo.productservice.dtos.ProductRequestDto;
import com.mo.productservice.exceptions.ResourceNotFoundException;
import com.mo.productservice.exceptions.ServiceLogicException;
import com.mo.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/product")
public class AdminProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<ApiResponseDto<?>> addProduct(@RequestBody ProductRequestDto requestDto) throws ServiceLogicException, ResourceNotFoundException {
        return productService.addProduct(requestDto);
    }

    @PutMapping("/edit")
    public ResponseEntity<ApiResponseDto<?>> editProduct(@RequestParam String productId, @RequestBody ProductRequestDto requestDto) throws ServiceLogicException, ResourceNotFoundException {
        return productService.editProduct(productId, requestDto);
    }

}
