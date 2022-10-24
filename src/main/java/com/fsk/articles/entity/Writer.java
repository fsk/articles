package com.fsk.articles.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;


import javax.persistence.Id;
import java.util.List;
import java.util.Set;

@Document(collation = "Writer")
@Data
public class Writer {

    @Id
    private Long writerId;

    @Field("name")
    private String name;

    @Field("surname")
    private String surname;

    @Field("email")
    private String email;

    @Field("password")
    private String password;

    @Field("writerName")
    private String writerName;

    @Field("company")
    private String company;

    @Field("image")
    private String image;

    @Field("desc")
    private String descriptionAbout;

    @DBRef(db = "Article")
    private List<Article> articleList;

    @DocumentReference(collection = "Communication")
    private CommunicationInformations communicationInformations;
}
