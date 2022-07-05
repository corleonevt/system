package com.catering.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("dishes")
public class Dishes {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    @TableField(exist = false)
    private Long classifyId;
    @TableField(exist = false)
    private Long unitId;
    private String size;
    private String brand;
    private Integer allotUnit;
    @TableField(exist = false)
    private Double taxRate;
    private Double salePrice;
    private Double purchasePrice; // 进货价
    private Long stock;
    @TableField(exist = false)
    private Double grossProfit;//毛利润
    @TableField(exist = false)
    private Integer pageNo;
    @TableField(exist = false)
    private Integer pageSize;
    private boolean flag;
}
