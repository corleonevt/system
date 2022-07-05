package com.catering.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.entity.Client;
import com.catering.system.entity.ClientMealRelation;

import java.util.List;

public interface ClientService {
    List<ClientMealRelation> queryClientMealById(Client client);
    ClientMealRelation queryClientMealByIds(ClientMealRelation clientMealRelation);
    String addClientMeal(ClientMealRelation clientMealRelation);
    List<ClientMealRelation> queryClientMeal(ClientMealRelation clientMealRelation);
}
