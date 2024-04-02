package com.example.articles.blogarticle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(path= "/api/v1/article")
public class BlogArticleController {

    private final BlogArticleService blogArticleService ;

    @Autowired
    public BlogArticleController ( BlogArticleService blogArticleService ){
        this.blogArticleService = blogArticleService;
    }

    @GetMapping
    public List<BlogArticle> getArticles(){
        return this.blogArticleService.getArticles();
    }
}
