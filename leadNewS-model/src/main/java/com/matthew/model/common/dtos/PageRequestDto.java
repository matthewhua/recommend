package com.matthew.model.common.dtos;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Matthew
 * @date 2020/10/24 10:01
 */
@Data
@Slf4j
public class PageRequestDto
{
	protected Integer size;
	protected Integer page;

	public void checkParam()
	{
		if (this.page == null || this.page < 0)
		{
			setPage(1);
		}
		if (this.page == null || this.size < 0 || this.size > 100)
		{
			setSize(10);
		}
	}
}
