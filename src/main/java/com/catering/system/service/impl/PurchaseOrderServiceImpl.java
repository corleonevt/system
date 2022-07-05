package com.catering.system.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.dao.PurchaseOrderDao;
import com.catering.system.entity.PurchaseOrder;
import com.catering.system.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {
    @Autowired
    private PurchaseOrderDao dao;
    @Override
    public Page<PurchaseOrder> queryAllPurchaseOrder(PurchaseOrder purchaseOrder) {
        return null;
    }
}
