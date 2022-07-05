package com.catering.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catering.system.entity.Supplier;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("SupplierDao")
public interface SupplierDao extends BaseMapper<Supplier> {
    String selectSuppliers(Supplier supplier);
}
