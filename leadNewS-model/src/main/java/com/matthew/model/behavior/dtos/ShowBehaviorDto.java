package com.matthew.model.behavior.dtos;

import com.matthew.model.annotation.IdEncrypt;
import com.matthew.model.article.pojos.ApArticle;
import lombok.Data;

import java.util.List;

/**
 * @author Matthew
 * @date 2020/10/24 9:40
 */
@Data
public class ShowBehaviorDto
{
	//设备Id
	@IdEncrypt
	Integer equipmentID;
	List<ApArticle> articleIds;
}
