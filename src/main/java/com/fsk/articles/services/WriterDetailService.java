package com.fsk.articles.services;

import com.fsk.articles.entity.Writer;
import com.fsk.articles.repository.WriterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class WriterDetailService {


    private final WriterRepository writerRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Writer findWriterByEmail(String email) {
        return writerRepository.findByEmail(email);
    }

    public void saveWriter(Writer writer) {
        writer.setPassword(bCryptPasswordEncoder.encode(writer.getPassword()));
        writerRepository.save(writer);
    }

    public Writer loadWriterByWriterName(String writerName) {
        return writerRepository.findWriterByWriterName(writerName).orElseThrow(() -> new ClassCastException());
    }


}
