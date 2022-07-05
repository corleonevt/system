package com.catering.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.dao.SupplyDao;
import com.catering.system.entity.Supply;
import com.catering.system.service.SupplyManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class SupplyManageServiceImpl implements SupplyManageService {
    @Autowired
    private SupplyDao dao;
    @Override
    public String addSupply(List<Supply> supply) {
        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        for (Supply supply1: supply) {
            start.setTime(supply1.getStartDate());
            end.setTime(supply1.getEndDate());

        }
       int rows = dao.insertSupply(supply);
        return rows>0?"新增成功":"新增失败";
    }

    @Override
    public String removeSupply(Supply supply) {
        return null;
    }

    @Override
    public String removeSupplyByDate(Supply supply) {
        return null;
    }

    @Override
    public Page<Supply> querySupply(Supply supply) {
        Page<Supply> page = new Page<>(supply.getPageNo(),supply.getPageSize());

        return null;
    }
}
