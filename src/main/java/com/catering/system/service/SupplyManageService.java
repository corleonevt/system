package com.catering.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.entity.Supply;

import java.util.List;

public interface SupplyManageService {
    String addSupply(List<Supply> supplies);
    String removeSupply(Supply supply);
    String removeSupplyByDate(Supply supply);
    Page<Supply> querySupply(Supply supply);

}
