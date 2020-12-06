package com.matthew.model.admin.dtos;

import com.matthew.model.admin.enums.CommonTableEnum;
import lombok.Data;

import java.util.List;

/**
 * @author Matthew
 * @date 2020/10/24 9:21
 */
@Data
public class CommonDto
{
	private Integer size;
	private Integer page;

	//操作模式 add, edit 编辑
	private String model;
	//操作的对象
	private CommonTableEnum name;
	//查询的条件
	private List<CommonWhereDto> where;
	//要修改的字段
	private List<CommonWhereDto> sets;

}
