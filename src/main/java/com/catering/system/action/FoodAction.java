package com.catering.system.action;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.entity.Dishes;
import com.catering.system.entity.DishesClassify;
import com.catering.system.service.DishesClassifyService;
import com.catering.system.service.DishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dishes")
public class FoodAction {
    @Autowired
    private DishesClassifyService service;
    @Autowired
    private DishesService dishesService;

    @RequestMapping("/queryDishesClassify")
    Page<DishesClassify> queryDishesClassify (@RequestBody DishesClassify dishesClassify){
        return service.queryDishesClassify(dishesClassify);
    }
    @RequestMapping("/addDishesClassify")
    public String addDishesClassify(@RequestBody DishesClassify dishesClassify){
        return service.AddDishesClassify(dishesClassify);
    }
    @RequestMapping("/modifyDishesClassify")
    public String modifyDishesClassify(@RequestBody DishesClassify dishesClassify){
        return service.modifyDishesClassify(dishesClassify);
    }
    @RequestMapping("/queryDishesClassifyById")
    public DishesClassify queryDishesClassifyById(@RequestBody DishesClassify dishesClassify){
        return service.queryDishesClassifyById(dishesClassify);
    }
    @RequestMapping("/queryAllDishes")
    public Page<Dishes> queryAllDishes(@RequestBody Dishes dishes){
        return dishesService.queryAllDishes(dishes);
    }
    @RequestMapping("queryDishes")
    public Page<Dishes> queryDishes(@RequestBody Dishes dishes){
        return dishesService.queryDishes(dishes);
    }
}
