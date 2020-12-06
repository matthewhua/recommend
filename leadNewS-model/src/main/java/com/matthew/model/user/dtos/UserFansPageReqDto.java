package com.matthew.model.user.dtos;

import com.matthew.model.common.dtos.PageRequestDto;
import lombok.Data;

@Data
public class UserFansPageReqDto extends PageRequestDto {
    private String fansName;
    private Short level;
}
