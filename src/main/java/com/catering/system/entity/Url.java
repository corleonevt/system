package com.catering.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("url")
public class Url {
    private Long id;
    private String permissionCode;//'参照权限'
    private String url;//请求地址路径
}
