package com.example.articles.controller;

import com.example.articles.service.BlogArticleService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path= "/article")
@Controller

public class ArticleController {
    private final BlogArticleService blogArticleService ;

    public ArticleController(BlogArticleService blogArticleService) {
        this.blogArticleService = blogArticleService;
    }


    @GetMapping(value= "{id}", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String article(@PathVariable(name = "id") Long id ){
        return "<style> #display-article{ margin: 50px auto; padding :30px;   text-align: center; }"+
                " #display-article #titre{ font-size:larger; text-align:center;}" +
                " #display-article #image{ width:700px; height:400px; object-fit:cover;}" +
                " #display-article #contenu{ padding: 30px 0;} </style>"+
                blogArticleService.getArticle(id).toHTMLPage();
    }


}


