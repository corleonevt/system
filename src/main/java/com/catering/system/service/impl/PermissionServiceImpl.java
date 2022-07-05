package com.catering.system.service.impl;

import com.catering.system.dao.UserDao;
import com.catering.system.dto.UserDto;
import com.catering.system.entity.UserRoleRelation;
import com.catering.system.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private UserDao dao ;
    @Override
    public String addRoleUser(UserDto dto) {
       for (Long id:dto.getUserId()){
            dao.deleteById(id);
       }
        List<UserRoleRelation> relations =new ArrayList<>();
       for (Long userId:dto.getUserId()){
           for (Long roleId:dto.getRoleId()){
               UserRoleRelation relation = new UserRoleRelation();
               relation.setUserId(userId);
               relation.setRoleId(roleId);
               relations.add(relation);
           }
       }
        int rows =dao.insertUserRoleRelation(relations);
        return rows>0?null:"授权失败";
    }
}
