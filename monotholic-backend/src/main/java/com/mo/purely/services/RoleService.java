package com.mo.purely.services;

import com.mo.purely.enums.ERole;
import com.mo.purely.modals.Role;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {
    Role findByName(ERole eRole);
}