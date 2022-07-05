package com.catering.system.action;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.entity.Supplier;
import com.catering.system.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierAction {
    @Autowired
    private SupplierService service;
    @RequestMapping("/addSupplier")
    public String addSupplier(@RequestBody Supplier supplier){
        return service.addSupplier(supplier);
    }
    @RequestMapping("/querySupplier")
    public Page<Supplier> querySupplier(@RequestBody Supplier supplier){
        return service.querySupplier(supplier);
    }
    @RequestMapping("/modifySupplier")
    public String modifySupplier(@RequestBody Supplier supplier){
        return service.modifySupplier(supplier);
    }
}
