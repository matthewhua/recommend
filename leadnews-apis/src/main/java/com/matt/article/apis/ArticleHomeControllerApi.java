package com.matt.article.apis;

import com.matthew.model.article.dtos.ArticleHomeDto;
import com.matthew.model.common.dtos.ResponseResult;

/**
 * @author Matthew
 * @date 2020/10/23 21:22
 */
public interface ArticleHomeControllerApi
{

	/**
	 * 加载首页文章
	 * @param dto
	 * @return
	 */
	public ResponseResult load(ArticleHomeDto dto);

	/**
	 * 加载更多
	 * @param dot
	 * @return
	 */
	public ResponseResult loadMore(ArticleHomeDto dot);

	/**
	 * 加载最新的文章信息
	 * @param dto
	 * @return
	 */
	public ResponseResult loadNew(ArticleHomeDto dto);
}
