package com.catering.system.action;

import com.catering.system.entity.Client;
import com.catering.system.entity.ClientMealRelation;
import com.catering.system.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientAction {
    @Autowired
    private ClientService service;
    @RequestMapping("/queryClientMealById")
    public ClientMealRelation queryClientMealById(@RequestBody ClientMealRelation clientMealRelation){
        return service.queryClientMealByIds(clientMealRelation);
    }
    @RequestMapping("/addClientMeal")
    public String addClientMeal(@RequestBody ClientMealRelation clientMealRelation){
        return service.addClientMeal(clientMealRelation);
    }
    @RequestMapping("/queryClientMeal")
    public List<ClientMealRelation> queryClientMeal(@RequestBody ClientMealRelation clientMealRelation){
        return service.queryClientMeal(clientMealRelation);
    }
}
