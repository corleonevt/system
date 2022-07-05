package com.catering.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catering.system.entity.DistributionType;
import org.springframework.stereotype.Repository;

@Repository("DistributionTypeDao")
public interface DistributionTypeDao extends BaseMapper<DistributionType> {
}
