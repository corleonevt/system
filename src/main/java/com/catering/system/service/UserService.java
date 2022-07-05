package com.catering.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.dto.UserDto;
import com.catering.system.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface UserService {
    User login(User user);
    Page<User>queryUsers(Page<User> page);
    String addUser(User user);
    User queryUserById(@Param("id") int id);
    String modifyUser(User user);
    String modifyPassword(User user);
}
