package com.catering.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catering.system.entity.Role;
import com.catering.system.entity.RolePermissionRelation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("RoleDao")
public interface RoleDao extends BaseMapper<Role> {
    int insertRolePermissionRelation(List<RolePermissionRelation> permissionRelations);
}
