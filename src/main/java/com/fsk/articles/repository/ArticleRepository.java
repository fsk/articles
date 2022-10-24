package com.fsk.articles.repository;

import com.fsk.articles.entity.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, Long> {
}
