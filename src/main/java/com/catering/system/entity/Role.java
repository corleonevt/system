package com.catering.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;
@Data
@TableName("role")
public class Role {
    private Long id;
    private String name;
    private List<Permission> permissionList;//装权限
}
