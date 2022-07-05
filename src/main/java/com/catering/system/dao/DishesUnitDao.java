package com.catering.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catering.system.entity.DishesUnit;
import org.springframework.stereotype.Repository;

@Repository("DishesUnitDao")
public interface DishesUnitDao extends BaseMapper<DishesUnit> {
}
