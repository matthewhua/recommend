package com.matthew.model.crawler.core.cookie;

import java.util.Date;

/**
 * @author Matthew
 * @date 2020/10/24 10:49
 */
public class CrawlerCookie
{
	public CrawlerCookie()
	{
	}

	/**
	 * cookie名称
	 */
	private String name;
	/**
	 * cookie 值
	 */
	private String value;
	/**
	 * 域名
	 */
	private String domain;
	/**
	 * 路径
	 */
	private String path;


	/**
	 * 过期时间
	 */
	private Date expire;

	/**
	 * 是否是必须的
	 */
	private boolean isRequired;


	public boolean isExpire(){
		boolean flag = false;
		if (null != expire)
		{
			flag = expire.getTime() <= (new Date()).getTime();
		}
		return flag;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Date getExpire() {
		return expire;
	}

	public void setExpire(Date expire) {
		this.expire = expire;
	}

	public boolean isRequired() {
		return isRequired;
	}

	public void setRequired(boolean required) {
		isRequired = required;
	}

	@Override
	public String toString() {
		return "CrawlerCookie{" +
				"name='" + name + '\'' +
				", value='" + value + '\'' +
				", domain='" + domain + '\'' +
				'}';
	}
}
