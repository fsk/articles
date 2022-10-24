package com.fsk.articles.entity;


import lombok.Data;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.Date;

@Document(collection = "Article")
@Data
public class Article {

    @Id
    private Long articleId;

    @Field("title")
    private String articleTitle;

    @Field("description")
    private String articleDescription;

    @Field("targetDate")
    private Date targetDate;

    @Field("addedDate")
    private Date addedDate;

    @Field("link")
    private String articleLink;

    @DBRef(db = "Writer")
    private Writer writer;
    
    private String image;

}
