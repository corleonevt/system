package com.catering.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.dao.DishesClassifyDao;
import com.catering.system.entity.DishesClassify;
import com.catering.system.entity.Supplier;
import com.catering.system.service.DishesClassifyService;
import com.catering.system.service.DishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishesClassifyServiceImpl implements DishesClassifyService {
    @Autowired
    private DishesClassifyDao dao;
    @Override
    public Page<DishesClassify> queryDishesClassify(DishesClassify dishesClassify) {
        Page<DishesClassify> page=new Page<>(dishesClassify.getPageNo(),dishesClassify.getPageSize());
        QueryWrapper<DishesClassify> wrapper=new QueryWrapper<>();
        wrapper.like("classify_name",dishesClassify.getClassifyName());
        return dao.selectPage(page,wrapper);
    }

    @Override
    public String AddDishesClassify(DishesClassify dishesClassify) {
        int rows = dao.insertDishes(dishesClassify);
        return rows>0?"新增成功":"新增失败";
    }

    @Override
    public DishesClassify queryDishesClassifyById(DishesClassify dishesClassify ) {
        return dao.selectById(dishesClassify.getId());
    }

    @Override
    public String modifyDishesClassify(DishesClassify dishesClassify) {
        int rows = dao.updateById(dishesClassify);
        return rows>0?"修改成功":"修改失败";
    }
}
