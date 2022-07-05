package com.catering.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("permission")
public class Permission  {
    private Long id;
    private String code;
    private String name;
}
