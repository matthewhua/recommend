package com.matthew.model.admin.dtos;

import lombok.Data;

@Data
public class CommonWhereDto {

    private String filed;
    private String type="eq";
    private String value;

}