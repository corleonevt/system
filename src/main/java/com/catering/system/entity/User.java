package com.catering.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;
@Data
@TableName("user")
public class User {
    private Long id;
    private String account;
    private String name;
    private String password;
    private String confirmPassword;
    private String methodName;
    private List<Permission> permissions;
    /**
     * 用户执行某个功能的时候，有没有这个权限代码
     * @param permissionCode
     * @return
     */
    public boolean checkPermission(String permissionCode){
        for (Permission permission : permissions){
            if (permissionCode.equals(permission.getCode())) return true;
        }
        return false;
    }
}
