package com.catering.system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @param
 * "采购单信息"
 *
 */
@Data
@TableName("purchase_order")
public class PurchaseOrder {
    private Long odd; //单号
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date date;  //日期
    private Double price; //总金额
    private String purchaseName; //采购人
    @TableField(exist = false)
    private boolean pay;//支付否
}
