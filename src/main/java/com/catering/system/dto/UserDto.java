package com.catering.system.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private String name;
    private Integer id;
    private List<Long> roleId;
    private List<Long> userId;
}
