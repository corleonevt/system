package com.catering.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catering.system.entity.DistributionLine;
import org.springframework.stereotype.Repository;

@Repository("DistributionLineDao")
public interface DistributionLineDao extends BaseMapper<DistributionLine> {
}
