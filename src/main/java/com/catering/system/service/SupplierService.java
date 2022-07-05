package com.catering.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.entity.Supplier;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierService {
    String addSupplier(Supplier supplier);
    Page<Supplier> querySupplier (Supplier supplier);
    String modifySupplier(Supplier supplier);
}
