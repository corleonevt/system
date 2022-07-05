package com.catering.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.entity.DishesUnit;

public interface DishesUnitService {
    Page<DishesUnit> queryDishesUnit(DishesUnit dishesUnit);
    String addDishesUnit(DishesUnit dishesUnit);
    String modifyDishesUnit( DishesUnit dishesUnit);
}
