package com.mo.purely.services;

import com.mo.purely.exceptions.UserNotFoundException;
import com.mo.purely.modals.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    boolean existsByUsername(String username);

    boolean existsByEmail(String Email);

    User findByEmail(String email) throws UserNotFoundException;


}
