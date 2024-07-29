package com.mo.authservice.services;

import com.mo.authservice.enums.ERole;
import com.mo.authservice.modals.Role;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {
    Role findByName(ERole eRole);
}