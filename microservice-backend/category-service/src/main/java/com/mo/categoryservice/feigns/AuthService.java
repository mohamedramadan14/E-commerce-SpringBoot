package com.mo.categoryservice.feigns;

import com.mo.categoryservice.dtos.ApiResponseDto;
import com.mo.categoryservice.security.UserDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("AUTH-SERVICE")
public interface AuthService {

    @GetMapping("/auth/isValidToken")
    ResponseEntity<ApiResponseDto<UserDetails>> validateToken(@RequestParam String token);

}
