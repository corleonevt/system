package com.catering.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catering.system.entity.DistributionArea;
import org.springframework.stereotype.Repository;

@Repository("DistributionAreaDao")
public interface DistributionAreaDao extends BaseMapper<DistributionArea> {
}
