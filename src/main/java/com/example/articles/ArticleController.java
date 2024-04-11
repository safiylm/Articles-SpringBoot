package com.example.articles;

import com.example.articles.blogarticle.BlogArticleService;
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


    @GetMapping(value= "", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String article(){
        return "<style> #display-article{ margin: 50px auto; padding :30px;}"+
                " #display-article #titre{ font-size:larger; text-align:center;}" +
                " #display-article #image{ width:700px; height:400px; object-fit:cover;}" +
                " #display-article #contenu{ padding: 30px 0;} </style>"+
                blogArticleService.getArticle(1L).toHTMLPage();
    }

}


