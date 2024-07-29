package com.mo.authservice.dtos;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserAuthorityDto {

    private String userId;

    private List<String> authorities;

}
