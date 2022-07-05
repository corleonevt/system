package com.catering.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.dao.DishesUnitDao;
import com.catering.system.entity.DishesClassify;
import com.catering.system.entity.DishesUnit;
import com.catering.system.service.DishesUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishesUnitServiceImpl implements DishesUnitService {
    @Autowired
    private DishesUnitDao dao;
    @Override
    public Page<DishesUnit> queryDishesUnit(DishesUnit dishesUnit) {
        Page<DishesUnit> page=new Page<>(dishesUnit.getPageNo(),dishesUnit.getPageSize());
        QueryWrapper<DishesUnit> wrapper=new QueryWrapper<>();
        wrapper.like("classify_name",dishesUnit.getUnitName());
        return dao.selectPage(page,wrapper);

    }

    @Override
    public String addDishesUnit(DishesUnit dishesUnit) {
        int rows = dao.insert(dishesUnit);
        return rows>0?"新增成功":"新增失败";
    }

    @Override
    public String modifyDishesUnit(DishesUnit dishesUnit) {
        int rows = dao.updateById(dishesUnit);
        return rows>0?"修改成功":"修改失败";
    }
}
