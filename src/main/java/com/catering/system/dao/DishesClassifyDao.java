package com.catering.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catering.system.entity.DishesClassify;
import org.springframework.stereotype.Repository;

@Repository("DishesClassifyDao")
public interface DishesClassifyDao extends BaseMapper<DishesClassify> {
    int insertDishes(DishesClassify dishesClassify);
}
