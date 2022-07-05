package com.catering.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.dto.UserDto;
import com.catering.system.entity.Permission;
import com.catering.system.entity.User;
import com.catering.system.entity.UserRoleRelation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("UserDao")
public interface UserDao extends BaseMapper<User> {
    User login(User user);
    List<Permission> selectPermission(@Param("userId") Long userId);
    Page<User> queryUsers(Page<User> page);
    int insertUserRoleRelation(List<UserRoleRelation> list);
}
