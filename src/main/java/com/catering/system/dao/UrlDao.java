package com.catering.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.catering.system.entity.Url;
import org.springframework.stereotype.Repository;

@Repository("UrlDao")
public interface UrlDao extends BaseMapper<Url> {
}
