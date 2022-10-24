package com.fsk.articles.repository;

import com.fsk.articles.entity.Writer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface WriterRepository extends MongoRepository<Writer, Long> {

    Writer findByEmail(String email);

    Optional<Writer> findWriterByWriterName(String writerName);
}
