package com.catering.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.entity.Dishes;

public interface DishesService {
    Page<Dishes> queryAllDishes(Dishes dishes);
    String addDishesByClassify(Dishes dishes);
    String modifyDishesById(Dishes dishes);
    Page<Dishes> queryDishes(Dishes dishes);


}
