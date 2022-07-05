package com.catering.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.entity.DishesClassify;
import org.apache.ibatis.annotations.Param;

public interface DishesClassifyService {
    Page<DishesClassify> queryDishesClassify(DishesClassify dishesClassify);
    String AddDishesClassify(DishesClassify dishesClassify);
    DishesClassify queryDishesClassifyById(DishesClassify dishesClassify);
    String modifyDishesClassify(DishesClassify dishesClassify);

}
