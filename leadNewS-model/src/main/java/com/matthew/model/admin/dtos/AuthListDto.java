package com.matthew.model.admin.dtos;

import lombok.Data;

/**
 * @author Matthew
 * @date 2020/10/24 9:19
 */
@Data
public class AuthListDto
{
	private Integer size;
	private Integer page;
	private Short status;
}
