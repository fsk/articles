package com.fsk.articles.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

@Document(collation = "Communication")
@Data
public class CommunicationInformations {

    @Id
    private Long id;

    @Field(name = "instagram")
    private String instagramAccount;

    @Field(name = "twitter")
    private String twitterAccount;

    @Field(name = "blog")
    private String blogSite;

    @Field(name = "github")
    private String githubAccount;

    @Field(name = "bitbucket")
    private String bitbucketAccount;

    @Field(name = "superpeer")
    private String superpeerAccount;

    @DocumentReference(collection = "Writer")
    private Writer writer;
}
