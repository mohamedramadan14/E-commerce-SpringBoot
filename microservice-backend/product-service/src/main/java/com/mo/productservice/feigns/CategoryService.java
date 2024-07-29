package com.mo.productservice.feigns;

import com.mo.productservice.dtos.ApiResponseDto;
import com.mo.productservice.dtos.CategoryDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("CATEGORY-SERVICE")
public interface CategoryService {

    @GetMapping("/category/get/byId")
    ResponseEntity<ApiResponseDto<CategoryDto>> getCategoryById(@RequestParam String id);

}
