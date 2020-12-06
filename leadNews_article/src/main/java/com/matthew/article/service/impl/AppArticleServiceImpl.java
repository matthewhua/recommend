package com.matthew.article.service.impl;

import com.matthew.common.article.constans.ArticleConstans;
import com.matthew.model.article.dtos.ArticleHomeDto;
import com.matthew.model.article.pojos.ApArticle;
import com.matthew.model.common.dtos.ResponseResult;
import com.matthew.model.mappers.app.ApArticleMapper;
import com.matthew.model.mappers.app.ApUserArticleListMapper;
import com.matthew.model.user.pojos.ApUser;
import com.matthew.model.user.pojos.ApUserArticleList;
import com.matthew.utils.threadlocal.AppThreadLocalUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author Matthew
 * @date 2020/10/27 23:15
 */
@Service
@SuppressWarnings("all")
public class AppArticleServiceImpl implements AppArticleService
{

	private static final short MAX_PAGE_SIZE = 50;

	@Override public ResponseResult<?> load(ArticleHomeDto dto, Short type)
	{

		//参数校验
		if(dto == null)
		{
			dto = new ArticleHomeDto();
		}
		//时间校验
		if (dto.getMaxBehotTime() == null)
		{
			dto.setMaxBehotTime(new Date());
		}

		//分页参数的校验
		Integer size = dto.getSize();
		if (size == null || size <= 0)
		{
			size = 20;
		}
		size = Math.min(size, MAX_PAGE_SIZE);

		//文章频道参数校验
		if(StringUtils.isEmpty(dto.getTag())){
			dto.setTag(ArticleConstans.DEFAULT_TAG);
		}

		//类型参数校验
		if(!type.equals(ArticleConstans.LOADTYPE_LOAD_MORE)&&!type.equals(ArticleConstans.LOADTYPE_LOAD_NEW)){
			type = ArticleConstans.LOADTYPE_LOAD_MORE;
		}

		//获取用户的信息
		ApUser user = AppThreadLocalUtils.getUser();

		//判断用户是否存在
		if (user != null)
		{
			// 存在已 登录 加载推荐的文章
			List<ApArticle> ArticleList = getUserArticle(user, dto, type);
			return ResponseResult.okResult(ArticleList);
		}
		else
		{
			//不存在 未登录，加载默认的文章
			List<ApArticle> apArticles = getDefaultArticle(dto, type);
			return ResponseResult.okResult(apArticles);
		}

	}

	@Autowired
	private ApArticleMapper apArticleMapper;

	/**
	 * 加载默认的文章信息
	 * @param dto
	 * @param type
	 * @return
	 */
	private List<ApArticle> getDefaultArticle(ArticleHomeDto dto, Short type) {
		return apArticleMapper.loadArticleListByLocation(dto,type);
	}

	@Autowired
	private ApUserArticleListMapper apUserArticleListMapper;


	private List<ApArticle> getUserArticle(ApUser user, ArticleHomeDto dto, Short type)
	{
		List<ApUserArticleList> apArticles = apUserArticleListMapper.loadArticleIdListByUser(user, dto, type);
		if (!apArticles.isEmpty())
		{
			return apArticleMapper.loadArticleListByIdList(apArticles);
		}
		else
		{
			return getDefaultArticle(dto, type);
		}
	}

}
