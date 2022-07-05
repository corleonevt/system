package com.catering.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.dao.ClientDao;
import com.catering.system.dao.MealDao;
import com.catering.system.entity.Client;
import com.catering.system.entity.ClientMealRelation;
import com.catering.system.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientDao dao;
    @Override
    public List<ClientMealRelation> queryClientMealById(Client client) {
        return dao.selectClientMealById(client);
    }

    @Override
    public ClientMealRelation queryClientMealByIds(ClientMealRelation clientMealRelation) {
        return dao.queryClientMealByIds(clientMealRelation);
    }

    @Override
    public String addClientMeal(ClientMealRelation clientMealRelation) {
        int rows = dao.insert(clientMealRelation);
        return rows>0?"新增成功":"新增失败" ;
    }

    @Override
    public List<ClientMealRelation> queryClientMeal(ClientMealRelation clientMealRelation) {
        return dao.selectClientMeal(clientMealRelation);
    }
}
