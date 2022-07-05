package com.catering.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.dao.RoleDao;
import com.catering.system.dto.RoleDto;
import com.catering.system.entity.Permission;
import com.catering.system.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RoleService {
    String addRole(RoleDto dto);
    Page<Role> queryRole (RoleDto dto);
    List<Permission> queryPermissionById(@Param("roleId") Long roleId);
    String modifyRole(RoleDto dto);
    String removeRole(@Param("id") Long id);
}
