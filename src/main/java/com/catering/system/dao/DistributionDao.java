package com.catering.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.catering.system.entity.Client;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("DistributionDao")
public interface DistributionDao extends BaseMapper<Client> {
    Page<Client> selectAllClient( Page<Client> page,@Param("client") Client client);
}
