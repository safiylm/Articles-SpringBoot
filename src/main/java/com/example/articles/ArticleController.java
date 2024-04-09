package com.example.articles;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path= "/article")
@Controller

public class ArticleController {

    @GetMapping(value= "", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String article(){
        return "article";
    }

}


