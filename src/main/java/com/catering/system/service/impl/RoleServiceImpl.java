package com.catering.system.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.dto.RoleDto;
import com.catering.system.entity.Permission;
import com.catering.system.entity.Role;
import com.catering.system.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public String addRole(RoleDto dto) {
        return null;
    }

    @Override
    public Page<Role> queryRole(RoleDto dto) {
        return null;
    }

    @Override
    public List<Permission> queryPermissionById(Long roleId) {
        return null;
    }

    @Override
    public String modifyRole(RoleDto dto) {
        return null;
    }

    @Override
    public String removeRole(Long id) {
        return null;
    }
}
