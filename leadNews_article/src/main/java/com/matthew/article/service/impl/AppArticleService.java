package com.matthew.article.service.impl;

import com.matthew.model.article.dtos.ArticleHomeDto;
import com.matthew.model.common.dtos.ResponseResult;

/**
 * @author Matthew
 * @date 2020/10/27 0:02
 */
public interface AppArticleService
{
	/**
	 * type  1 加载更多  2 加载更新
	 * @param dto
	 * @param type
	 * @return
	 */
	ResponseResult<?> load(ArticleHomeDto dto, Short type);
}
