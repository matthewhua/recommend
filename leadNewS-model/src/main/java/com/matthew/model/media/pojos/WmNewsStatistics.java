package com.matthew.model.media.pojos;

import com.matthew.model.annotation.IdEncrypt;
import lombok.Data;

import java.util.Date;

@Data
public class WmNewsStatistics {
    public static final String FILEDS_ARTICLE =  "article";
    public static final String FILEDS_COLLECTION =  "collection";
    public static final String FILEDS_READ_COUNT =  "readCount";
    public static final String FILEDS_FORWARD =  "forward";
    public static final String FILEDS_UNLIKES =  "unlikes";
    public static final String FILEDS_FOLLOW =  "follow";
    public static final String FILEDS_UNFOLLOW =  "unfollow";
    private Long id;
    @IdEncrypt
    private Long userId;
    private Integer article;
    private Integer readCount;
    private Integer comment;
    private Integer follow;
    private Integer collection;
    private Integer forward;
    private Integer likes;
    private Integer unlikes;
    private Integer unfollow;
    private Date createdTime;
    private String burst;
}