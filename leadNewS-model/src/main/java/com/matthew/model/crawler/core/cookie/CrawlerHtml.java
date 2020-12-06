package com.matthew.model.crawler.core.cookie;

import java.util.List;

/**
 * @author Matthew
 * @date 2020/10/24 10:51
 */
public class CrawlerHtml
{

	private String html;

	private List<CrawlerCookie> crawlerCookieList = null;

	public String getHtml()
	{
		return html;
	}

	public void setHtml(String html)
	{
		this.html = html;
	}

	public List<CrawlerCookie> getCrawlerCookieList()
	{
		return crawlerCookieList;
	}

	public void setCrawlerCookieList(List<CrawlerCookie> crawlerCookieList)
	{
		this.crawlerCookieList = crawlerCookieList;
	}
}
