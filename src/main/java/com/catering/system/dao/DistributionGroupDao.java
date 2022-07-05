package com.catering.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catering.system.entity.DistributionGroup;
import org.springframework.stereotype.Repository;

@Repository("DistributionGroupDao")
public interface DistributionGroupDao extends BaseMapper<DistributionGroup> {
}
