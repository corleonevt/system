package com.catering.system.action;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.entity.*;
import com.catering.system.service.ClientService;
import com.catering.system.service.DistributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/distribution")
public class DistributionAction {
    @Autowired
    private DistributionService service;
    @Autowired
    private ClientService clientService;

    @RequestMapping("queryLine")
    public Page<DistributionLine> queryLine(@RequestBody DistributionLine distributionLine){
        return service.queryLine(distributionLine);
    }
    @RequestMapping("/addDistributionLine")
    public String addDistributionLine(@RequestBody DistributionLine distributionLine){
        return service.addDistributionLine(distributionLine);
    }
    @RequestMapping("/modifyDistributionLine")
    public String modifyDistribution(@RequestBody DistributionLine distributionLine){
        return service.modifyLine(distributionLine);
    }
    @RequestMapping("/queryDistributionById")
    public DistributionLine queryDistributionById(@RequestBody  DistributionLine distributionLine){
        return service.queryDistributionById(distributionLine);
    }
    @RequestMapping("/queryArea")
    public Page<DistributionArea> queryArea(@RequestBody DistributionArea distributionArea){
        return service.queryArea(distributionArea);
    }
    @RequestMapping("/addDistributionArea")
    public String addDistributionArea(@RequestBody DistributionArea distributionArea){
        return service.addDistributionArea(distributionArea);
    }
    @RequestMapping("/modifyDistributionArea")
    public String modifyDistributionArea(@RequestBody DistributionArea distributionArea){
        return service.modifyArea(distributionArea);
    }
    @RequestMapping("/queryDistributionAreaById")
    public DistributionArea queryDistributionAreaById(@RequestBody  DistributionArea distributionArea){
        return service.queryDistributionAreaById(distributionArea);
    }
    @RequestMapping("/queryGroup")
    public Page<DistributionGroup> queryGroup(@RequestBody DistributionGroup distributionGroup){
        return service.queryGroup(distributionGroup);
    }
    @RequestMapping("/addDistributionGroup")
    public String addDistributionGroup(@RequestBody DistributionGroup distributionGroup){
        return service.addDistributionGroup(distributionGroup);
    }
    @RequestMapping("/modifyDistributionGroup")
    public String modifyDistributionGroup(@RequestBody DistributionGroup distributionGroup){
        return service.modifyGroup(distributionGroup);
    }
    @RequestMapping("/queryDistributionGroupById")
    public DistributionGroup queryDistributionGroupById(@RequestBody  DistributionGroup distributionGroup){
        return service.queryDistributionGroupById(distributionGroup);
    }
    @RequestMapping("/queryType")
    public Page<DistributionType> queryType(@RequestBody DistributionType distributionType){
        return service.queryType(distributionType);
    }
    @RequestMapping("/addDistributionType")
    public String addDistributionType(@RequestBody DistributionType distributionType){
        return service.addDistributionType(distributionType);
    }
    @RequestMapping("/modifyDistributionType")
    public String modifyDistributionType(@RequestBody DistributionType distributionType){
        return service.modifyType(distributionType);
    }
    @RequestMapping("/queryDistributionTypeById")
    public DistributionType queryDistributionTypeById(@RequestBody  DistributionType distributionType){
        return service.queryDistributionTypeById(distributionType);
    }
    @RequestMapping("/queryAllClient")
    public Page<Client> queryAllClient(@RequestBody Client client){
        return service.queryClient(client);
    }
    @RequestMapping("/addClient")
    public String addClient(@RequestBody Client client){
        return service.addClient(client);
    }
    @RequestMapping("/queryClientById")
    public Client queryClientById(@RequestBody Client client){
        return service.querycliientById(client);
    }
    @RequestMapping("/modifyClient")
    public String modifyClient(@RequestBody Client client){
        return service.modifyClient(client);
    }
    @RequestMapping("/stopClient")
    public boolean stopClient(@RequestBody Client client){
        return service.stopClientDistribution(client);
    }
    @RequestMapping("/queryMeal")
    public Page<MealType> queryMeal(@RequestBody MealType mealType){
        return service.queryMeal(mealType);
    }
    @RequestMapping("/addMeal")
    public String addMeal(@RequestBody MealType mealType){
        return service.addMeal(mealType);
    }
    @RequestMapping("/queryMealById")
    public MealType queryMealById(@RequestBody MealType mealType){
        return service.queryMealById(mealType);
    }
    @RequestMapping("/modifyMeal")
    public String modifyMeal(@RequestBody MealType mealType){
        return service.modifyMeal(mealType);
    }
    @RequestMapping("/selectClientMealById")
    public List<ClientMealRelation> selectClientMealById(@RequestBody Client client){
        return clientService.queryClientMealById(client);
    }
}
