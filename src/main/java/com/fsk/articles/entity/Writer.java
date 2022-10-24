package com.fsk.articles.entity;

import com.fsk.articles.enums.Role;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.List;

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

    @Field("title")
    private String title;

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

    @Field("role")
    private Role role;

}
