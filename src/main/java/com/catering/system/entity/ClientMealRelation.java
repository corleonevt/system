package com.catering.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@Data
@TableName("client_meal_relation")
public class ClientMealRelation {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Long clientId;
    private Long mealId;
    private String mealName;
    private Double mealStandard;
    private Integer eatNumbers;
}
