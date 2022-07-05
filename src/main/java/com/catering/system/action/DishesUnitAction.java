package com.catering.system.action;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.entity.DishesUnit;
import com.catering.system.service.DishesUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unit")
public class DishesUnitAction {
    @Autowired
    private DishesUnitService service;
    @RequestMapping("/queryDishesUnit")
    public Page<DishesUnit> queryDishesUnit(@RequestBody DishesUnit dishesUnit){
        return service.queryDishesUnit(dishesUnit);
    }
    @RequestMapping("/addDishesUnit")
    public String addDishesUnit(@RequestBody DishesUnit dishesUnit){
        return service.addDishesUnit(dishesUnit);
    }
    @RequestMapping("/modifyDishesUnit")
    public String modifyDishesUnit(@RequestBody DishesUnit dishesUnit){
        return service.modifyDishesUnit(dishesUnit);
    }
}
