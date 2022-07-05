package com.catering.system.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.dao.DishesDao;
import com.catering.system.entity.Dishes;
import com.catering.system.service.DishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishesServiceImpl implements DishesService {
    @Autowired
    private DishesDao dao;
    @Override
    public Page<Dishes> queryAllDishes(Dishes dishes) {
        Page<Dishes> page = new Page<>(dishes.getPageNo(),dishes.getPageSize());
        return dao.selectAllDishes(page,dishes);
    }

    @Override
    public String addDishesByClassify(Dishes dishes) {
        int rows = dao.insert(dishes);
        return rows>0?"新增成功":"新增失败";
    }

    @Override
    public String modifyDishesById(Dishes dishes) {
        return null;
    }

    @Override
    public Page<Dishes> queryDishes(Dishes dishes) {
        Page<Dishes> page = new Page<>(dishes.getPageNo(),dishes.getPageSize());
        return dao.selectDishes(page,dishes);
    }
}
