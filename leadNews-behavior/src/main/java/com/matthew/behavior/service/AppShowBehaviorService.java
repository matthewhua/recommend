package com.matthew.behavior.service;

import com.matthew.model.behavior.dtos.ShowBehaviorDto;
import com.matthew.model.common.dtos.ResponseResult;

/**
 * @author Matthew
 * @date 2020/10/27 21:57
 */
public interface AppShowBehaviorService
{
	ResponseResult saveShowBehavior(ShowBehaviorDto dto);
}
