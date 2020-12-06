package com.matthew.utils.common;

/**
 * @author Matthew
 * @date 2020/10/24 20:41
 * 分片桶字段算法
 */
public class BurstUtils
{


	public final static String SPLIT_CHAR = "_";

	/**
	 * 用-符号链接
	 * @param fileds
	 * @return
	 */
	public static String encrypt(Object... fileds)
	{
		StringBuffer stringBuffer = new StringBuffer();
		if (fileds != null && fileds.length > 0)
		{
			stringBuffer.append(fileds[0]);
			for (int i = 1; i < fileds.length; i++)
			{
				stringBuffer.append(SPLIT_CHAR).append(fileds[i]);
			}
		}
		return stringBuffer.toString();
	}


	public static String groupOne(Object... fileds)
	{
		StringBuffer buffer = new StringBuffer();
		if(fileds!=null&&fileds.length>0) {
			buffer.append("0");
			for (int i = 0; i < fileds.length; i++) {
				buffer.append(SPLIT_CHAR).append(fileds[i]);
			}
		}
		return buffer.toString();
	}
}
