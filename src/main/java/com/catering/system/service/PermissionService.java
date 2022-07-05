package com.catering.system.service;

import com.catering.system.dto.UserDto;
import org.springframework.stereotype.Service;


public interface PermissionService {
        String addRoleUser(UserDto dto);
}
