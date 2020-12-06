package com.matthew.model.crawler.core.proxy;

import com.matthew.model.crawler.core.callback.ProxyProviderCallBack;

import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Matthew
 * @date 2020/10/24 10:41
 * 代理IP 的提供者
 */
public class CrawlerProxyProvider
{
	/**
	 * 读写锁特点
	 * 读读共享
	 * 写写互斥
	 * 读写互斥
	 */
	private ReadWriteLock lock = new ReentrantReadWriteLock();

	//获取读锁
	private Lock readLock = lock.readLock();

	//获取写锁
	private Lock writeLock = lock.writeLock();

	private Random random = new  Random();

	private boolean isUsedProxyIp  = true;

	public CrawlerProxyProvider()
	{
	}

	public CrawlerProxyProvider(List<CrawlerProxy> crawlerProxyList)
	{
		this.crawlerProxyList = crawlerProxyList;
	}
	/**
	 * 代理Ip池
	 */
	private List<CrawlerProxy> crawlerProxyList = null;

	/**
	 * ip池回调
	 */
	private ProxyProviderCallBack proxyProviderCallBack;

	/**
	 *
	 * @return 随机获取一个代理IP 保证每次请求使用的IP 都不一样
	 */
	public CrawlerProxy getRandomProxy()
	{
		CrawlerProxy crawlerProxy = null;
		readLock.lock();
		try
		{
			if (isUsedProxyIp && null != crawlerProxyList && !crawlerProxyList.isEmpty())
			{

				int randomIndex = random.nextInt(crawlerProxyList.size());
				crawlerProxy = crawlerProxyList.get(randomIndex);
			}

		}
		finally
		{
			readLock.unlock();
		}
		return crawlerProxy;
	}

	public void updateProxy()
	{
		//不使用代理IP 则不进行更新
		if (!isUsedProxyIp)
		{
			return;
		}
		if (null != proxyProviderCallBack)
		{
			writeLock.lock();
			try
			{
				proxyProviderCallBack.getProxyList();
			}
			finally
			{
				writeLock.unlock();
			}
		}
	}


	public List<CrawlerProxy> getCrawlerProxyList() {
		return crawlerProxyList;
	}

	public void setCrawlerProxyList(List<CrawlerProxy> crawlerProxyList) {
		this.crawlerProxyList = crawlerProxyList;
	}

	public boolean isUsedProxyIp() {
		return isUsedProxyIp;
	}

	public void setUsedProxyIp(boolean usedProxyIp) {
		isUsedProxyIp = usedProxyIp;
	}

	public ProxyProviderCallBack getProxyProviderCallBack() {
		return proxyProviderCallBack;
	}

	public void setProxyProviderCallBack(ProxyProviderCallBack proxyProviderCallBack) {
		this.proxyProviderCallBack = proxyProviderCallBack;
	}
}
