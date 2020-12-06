package com.matthew.model.mess.admin;


import com.matthew.model.article.pojos.ApArticleConfig;
import com.matthew.model.article.pojos.ApArticleContent;
import com.matthew.model.article.pojos.ApAuthor;
import lombok.Data;

@Data
public class AutoReviewClNewsSuccess {
    private ApArticleConfig apArticleConfig;
    private ApArticleContent apArticleContent;
    private ApAuthor apAuthor;

}
