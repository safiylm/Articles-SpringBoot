package com.example.articles.controller;
import com.example.articles.service.BlogArticleService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //
@RequestMapping(path= "/")

public class IndexController {

    private final BlogArticleService blogArticleService ;

    public IndexController(BlogArticleService blogArticleService) {
        this.blogArticleService = blogArticleService;
    }

   @GetMapping(value= "", produces = MediaType.TEXT_HTML_VALUE)
    public String index(@RequestParam(name="name",  defaultValue="World") String name, Model model
                         ) {
         model.addAttribute("name", blogArticleService.getArticles());
         return "index.html";
    }

    @GetMapping("/edit")
    public String about(Model model) {
        model.addAttribute("name", "Edit Article");
        return "edit.html";
    }

}


