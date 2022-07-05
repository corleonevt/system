package com.catering.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("supplier")
public class Supplier {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    private String tel;
    private String address;
    private boolean aptitudes;
    private Date aptitudesDate;
    private boolean aptitudesState;
    @TableField(exist = false)
    private Integer pageNo;
    @TableField(exist = false)
    private Integer pageSize;
}
