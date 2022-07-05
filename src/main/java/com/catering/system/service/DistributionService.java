package com.catering.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.entity.*;

public interface DistributionService {
    String addDistributionLine(DistributionLine distributionLine);
    Page<DistributionLine> queryLine(DistributionLine distributionLine);
    String modifyLine(DistributionLine distributionLine);
    DistributionLine queryDistributionById(DistributionLine distributionLine);
    String addDistributionArea(DistributionArea distributionArea);
    Page<DistributionArea> queryArea(DistributionArea distributionArea);
    String modifyArea(DistributionArea distributionArea);
    DistributionArea queryDistributionAreaById(DistributionArea distributionArea);
    String addDistributionGroup(DistributionGroup distributionGroup);
    Page<DistributionGroup> queryGroup(DistributionGroup distributionGroup);
    String modifyGroup(DistributionGroup distributionGroup);
    DistributionGroup queryDistributionGroupById(DistributionGroup distributionGroup);
    String addDistributionType(DistributionType distributionType);
    Page<DistributionType> queryType(DistributionType distributionType);
    String modifyType(DistributionType distributionType);
    DistributionType queryDistributionTypeById(DistributionType distributionType);
    Page<Client> queryClient(Client client);
    String addClient(Client client);
    String modifyClient(Client client);
    Client querycliientById(Client client);
    Boolean stopClientDistribution(Client client);
    Page<MealType> queryMeal(MealType mealType);
    MealType queryMealById(MealType mealType);
    String modifyMeal(MealType mealType);
    String addMeal(MealType mealType);
}
