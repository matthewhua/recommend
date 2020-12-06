package com.matthew.behavior.controller.v1;

import com.matt.article.apis.BehaviorControllerApi;
import com.matthew.behavior.service.AppShowBehaviorService;
import com.matthew.model.behavior.dtos.ShowBehaviorDto;
import com.matthew.model.common.dtos.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Matthew
 * @date 2020/10/27 22:01
 */
@RestController
@RequestMapping("/api/v1/behavior")
public class BehaviorController implements BehaviorControllerApi
{

	@Autowired
	private AppShowBehaviorService appShowBehaviorService;

	@RequestMapping("/save_behavior")
	@Override public ResponseResult saveShowBehavior(ShowBehaviorDto dto)
	{
		return appShowBehaviorService.saveShowBehavior(dto);
	}
}
