package com.mo.purely.services.impls;

import com.mo.purely.enums.ERole;
import com.mo.purely.modals.Role;
import com.mo.purely.repositories.RoleRepository;
import com.mo.purely.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findByName(ERole eRole) {
        return roleRepository.findByName(eRole)
                .orElseThrow(() -> new RuntimeException("Role is not found."));
    }
}
