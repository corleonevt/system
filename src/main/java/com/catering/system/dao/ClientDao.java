package com.catering.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catering.system.entity.Client;
import com.catering.system.entity.ClientMealRelation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.annotation.PreDestroy;
import java.util.List;

@Repository("ClientDao")
public interface ClientDao extends BaseMapper<ClientMealRelation> {
    List<ClientMealRelation> selectClientMealById(@Param("client") Client client);
    ClientMealRelation queryClientMealByIds(ClientMealRelation clientMealRelation);
    List<ClientMealRelation> selectClientMeal(ClientMealRelation clientMealRelation);
}
