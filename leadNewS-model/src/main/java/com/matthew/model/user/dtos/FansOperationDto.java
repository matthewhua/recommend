package com.matthew.model.user.dtos;

import com.matthew.model.annotation.IdEncrypt;
import lombok.Data;

/**
 * @author Matthew
 * @date 2020/10/24 19:26
 */
@Data
public class FansOperationDto
{
	@IdEncrypt
	private Integer fansId;

	/**
	 * true 开   false 关
	 */
	private Boolean switchState;
}
