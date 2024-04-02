package com.example.articles.blogarticle;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogArticleService {


    public List<BlogArticle> getArticles(){
        return List.of(new BlogArticle("Les cookies", "ytvbjk", "Helloooo" ));
    }

}
