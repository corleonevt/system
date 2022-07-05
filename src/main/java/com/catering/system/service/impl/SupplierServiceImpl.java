package com.catering.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.dao.SupplierDao;
import com.catering.system.entity.Supplier;
import com.catering.system.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierDao dao;
    @Override
    public String addSupplier(Supplier supplier) {
        int rows = dao.insert(supplier);
        return rows>0?null:"新增失败";
    }

    @Override
    public Page<Supplier> querySupplier(Supplier supplier) {
        Page<Supplier> page=new Page<>(supplier.getPageNo(),supplier.getPageSize());
        QueryWrapper<Supplier> wrapper=new QueryWrapper<>();
        wrapper.like("name",supplier.getName());
        wrapper.like("address",supplier.getAddress());
        wrapper.eq("aptitudes_state",supplier.isAptitudesState());
        return dao.selectPage(page,wrapper);

    }

    @Override
    public String modifySupplier(Supplier supplier) {
        dao.selectSuppliers(supplier);
        int rows = dao.updateById(supplier);
        return rows>0?null:"修改失败";
    }

}
