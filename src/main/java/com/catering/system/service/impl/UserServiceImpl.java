package com.catering.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.dao.UserDao;
import com.catering.system.dto.UserDto;
import com.catering.system.entity.User;
import com.catering.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;
    @Override
    public User login(User user) {
        User users = dao.login(user);
        if (user != null){
            users.setPermissions(dao.selectPermission(users.getId()));
        }
        return users;
    }

    @Override
    public Page<User> queryUsers(Page<User> page) {
        return dao.queryUsers(page);
    }

    @Override
    public String addUser(User user) {
        user.setPassword("123456");
        int rows = dao.insert(user);
        return rows>0?null:"新增失败";
    }

    @Override
    public User queryUserById(int id) {
        return dao.selectById(id);
    }

    @Override
    public String modifyUser(User user) {
        int rows = dao.updateById(user);
        return rows>0?null:"修改失败";
    }

    @Override
    public String modifyPassword(User user) {
        return null;
    }
}
