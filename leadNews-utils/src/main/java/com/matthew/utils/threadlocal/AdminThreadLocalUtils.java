package com.matthew.utils.threadlocal;

import com.matthew.model.admin.pojos.AdUser;

/**
 * @author Matthew
 * @date 2020/10/24 19:49
 */
public class AdminThreadLocalUtils
{
	private final static ThreadLocal<AdUser> userThreadLocal = new ThreadLocal<>();



	/**
	 * 设置当前线程中的用户
	 * @param user
	 */
	public static void setUser(AdUser user)
	{
		userThreadLocal.set(user);
	}

	/**
	 * 获取线程中的用户
	 * @return
	 */
	public static ThreadLocal<AdUser> getUserThreadLocal()
	{
		return userThreadLocal;
	}
}
