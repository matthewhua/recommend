package com.matthew.model.quartz.dtos;

import lombok.Data;

/**
 * @author Matthew
 * @date 2020/10/24 19:29
 */
@Data
public class QuartzJob
{
	/**
	 * 任务名称
	 */
	private String jobName;
	/**
	 * 分组名称
	 */
	private String jobGroup;

	/**
	 * 类名称
	 */
	private String beanId;
	/**
	 * 执行的方法
	 */
	private String method;
	/**
	 * cron 表达式
	 */
	private String cronExpression;
	/**
	 * 重复时间
	 */
	private Long repeatTime;

	/**
	 * 是否是cron表达式
	 */
	private Boolean cronJob;
	/**
	 * 调度名称
	 */
	private String schedulerName;
}
