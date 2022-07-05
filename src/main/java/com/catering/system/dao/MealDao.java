package com.catering.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catering.system.entity.Client;
import com.catering.system.entity.ClientMealRelation;
import com.catering.system.entity.MealType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("MealDao")
public interface MealDao extends BaseMapper<MealType> {
}
