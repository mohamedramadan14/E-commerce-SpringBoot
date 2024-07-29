package com.mo.productservice.controllers;

import com.mo.productservice.dtos.ApiResponseDto;
import com.mo.productservice.exceptions.ResourceNotFoundException;
import com.mo.productservice.exceptions.ServiceLogicException;
import com.mo.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/product")
public class CommonProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/get/all")
    public ResponseEntity<ApiResponseDto<?>> getAllProducts() throws ServiceLogicException{
        return productService.getAllProducts();
    }

    @GetMapping("/get/byId")
    public ResponseEntity<ApiResponseDto<?>> getProductById(@RequestParam String id) throws ServiceLogicException{
        return productService.getProductById(id);
    }

    @GetMapping("/get/byCategory")
    public ResponseEntity<ApiResponseDto<?>> getProductByCategory(@RequestParam String id) throws ServiceLogicException, ResourceNotFoundException {
        return productService.getProductByCategory(id);
    }

    @GetMapping("/search")
    public ResponseEntity<ApiResponseDto<?>> searchProducts(@RequestParam String searchKey) throws ServiceLogicException{
        return productService.searchProducts(searchKey);
    }


}