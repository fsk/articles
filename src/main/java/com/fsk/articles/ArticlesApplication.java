package com.fsk.articles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ArticlesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticlesApplication.class, args);
    }

}
