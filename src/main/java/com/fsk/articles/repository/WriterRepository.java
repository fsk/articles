package com.fsk.articles.repository;

import com.fsk.articles.entity.Writer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WriterRepository extends MongoRepository<Writer, Long> {
}
