package com.catering.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.entity.PurchaseOrder;

public interface PurchaseOrderService {
    Page<PurchaseOrder> queryAllPurchaseOrder(PurchaseOrder purchaseOrder);
}
