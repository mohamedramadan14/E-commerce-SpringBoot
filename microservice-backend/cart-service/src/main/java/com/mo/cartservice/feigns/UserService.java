package com.mo.cartservice.feigns;

import com.mo.cartservice.dtos.ApiResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("USER-SERVICE")
public interface UserService {

    @GetMapping("/user/exists/byId")
    ResponseEntity<ApiResponseDto<Boolean>> existsUserById(@RequestParam String userId);

}
