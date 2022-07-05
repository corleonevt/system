package com.catering.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.entity.PurchaseOrder;
import org.springframework.stereotype.Repository;

@Repository("PurchaseOrderDao")
public interface PurchaseOrderDao extends BaseMapper<PurchaseOrder> {
    Page<PurchaseOrder> selectAllPurchaseOrder(PurchaseOrder purchaseOrder);
    int insertPurchaseOrder(PurchaseOrder purchaseOrder);
    String modifyPurchaseOrderById(Long id);
}
