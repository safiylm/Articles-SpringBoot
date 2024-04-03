package com.example.articles;

import com.example.articles.blogarticle.BlogArticle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@EnableMongoRepositories

public class ArticlesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArticlesApplication.class, args);
	}


}

// spring.data.mongodb.uri=mongodb+srv://safii:SafinazYilmaz@Cluster0.mongodb.net/trelloo_db