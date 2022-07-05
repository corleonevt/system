package com.catering.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("role_permission_relation")
public class RolePermissionRelation {
    private Long id;
    private Long roleId;//角色id
    private Long permissionId;//权限id
}
