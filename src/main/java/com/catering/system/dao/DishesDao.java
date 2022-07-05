package com.catering.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.entity.Dishes;
import org.springframework.stereotype.Repository;

@Repository("DishesDao")
public interface DishesDao extends BaseMapper<Dishes> {
    Page<Dishes> selectAllDishes(Page<Dishes> dishesPage,Dishes dishes);
    Page<Dishes> selectDishes(Page<Dishes> page, Dishes dishes);
}
