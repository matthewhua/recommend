package com.matt.article.apis;

import com.matthew.model.behavior.dtos.ShowBehaviorDto;
import com.matthew.model.common.dtos.ResponseResult;

/**
 * @author Matthew
 * @date 2020/10/24 20:16
 */
public interface BehaviorControllerApi
{

	/**
	 * 保存用户点击文章的行为
	 * @param dto
	 * @return
	 */
	ResponseResult saveShowBehavior(ShowBehaviorDto dto);
}
