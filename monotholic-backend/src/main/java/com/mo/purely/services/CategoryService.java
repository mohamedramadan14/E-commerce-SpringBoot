package com.mo.purely.services;


import com.mo.purely.dtos.responses.ApiResponseDto;
import com.mo.purely.exceptions.CategoryAlreadyExistsException;
import com.mo.purely.exceptions.ServiceLogicException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {

    ResponseEntity<ApiResponseDto<?>> getAllCategories() throws ServiceLogicException;

    ResponseEntity<ApiResponseDto<?>> getCategoryById(String categoryId) throws ServiceLogicException;

    ResponseEntity<ApiResponseDto<?>> createCategory(String name) throws ServiceLogicException, CategoryAlreadyExistsException;

}
