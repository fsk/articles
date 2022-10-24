package com.fsk.articles.entity;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

@Document(collection = "Article")
@Data
public class Article {

    @Id
    private Long articleId;
    private String articleTitle;
    private String articleDescription;
    private Date shouldFinishDate;
    private Date addedDate;
    private String articleLink;

    private Writer writer;
    private String image;

}
