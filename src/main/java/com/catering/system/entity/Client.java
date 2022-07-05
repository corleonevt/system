package com.catering.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("client")
public class Client {
    private String name;
    @TableId(type = IdType.AUTO)
    private Long id;
    private String address;
    private String type;
    private String clientLinkman;
    private String tel;
    private Long lineId;
    private Long areaId;
    private Long typeId;
    private Long groupId;
    @TableField(exist = false)
    private String lineName;
    @TableField(exist = false)
    private String areaName;
    @TableField(exist = false)
    private String typeName;
    @TableField(exist = false)
    private String groupName;
    private String driver;
    private boolean stopClient;
    @TableField(exist = false)
    private Integer pageNo;
    @TableField(exist = false)
    private Integer pageSize;


}
