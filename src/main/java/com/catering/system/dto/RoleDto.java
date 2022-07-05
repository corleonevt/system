package com.catering.system.dto;

import lombok.Data;

import java.util.List;
@Data
public class RoleDto {
    private Integer pageNo;
    private Integer pageSize;
    private Long id;
    private String name;
    private List<Long> permissionId;

}
