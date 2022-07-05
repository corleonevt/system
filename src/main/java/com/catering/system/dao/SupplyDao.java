package com.catering.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.entity.Supply;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("SupplyDao")
public interface SupplyDao extends BaseMapper<Supply> {
    int insertSupply(List<Supply> supplies);
    Page<Supply> selectSupply(Supply supply);
    Page<Supply> selectSupplyByDate(Supply supply);
}
