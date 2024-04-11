package com.example.articles;

import com.example.articles.blogarticle.BlogArticleService;
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

 //   @GetMapping("/")
    @GetMapping(value= "", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody //
    public String index(//@RequestParam(name="name",  defaultValue="World") String name, Model model
                         ) {
      //  model.addAttribute("name", "name");
       // return "index.html";
       String res =  "<!DOCTYPE html>\n" +
                "<html xmlns:th=\"http://www.thymeleaf.org\"><head>\n" +
                "    <title>Index</title>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\n" +
                "    <style>\n" +
                "        #liste-of-articles .div-article{\n" +
                "            width:310px;\n" +
                "            height:340px;\n" +
                "            margin: 20px;\n" +
                "            box-shadow : 5px 5px 5px 5px gray;\n" +
                "            border-radius: 10px 10px 0 0;\n" +
                "            transition: transform .5s ease;\n" +
                "        }\n" +
                "\n" +
                "        .div-article:hover {\n" +
                "             transform: scale(1.05);\n" +
                "            /* (150% zoom - Note: if the zoom is too large, it will go outside of the viewport) */\n" +
                "        }\n" +
                "        .div-article img{\n" +
                "            width:310px;\n" +
                "            height:260px;\n" +
                "            object-fit:cover;\n" +
                "            border-radius: 10px 10px 0 0;\n" +
                "        }\n" +
                "\n" +
                "        .div-article p {\n" +
                "            height: 80px;\n" +
                "            padding :10px;\n" +
                "            text-align:center;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p th:text=\"|Hello, ${name}!|\" />\n" +
                "\n" +
                "<a href=\"/edit\">Edit </a>\n" +
                "<a href=\"/article\">Article </a>\n" +
                "<a href=\"/create\">Create </a>\n" +
                "<div id=\"liste-of-articles\" class=\"d-flex flex-row align-items-center justify-content-center flex-wrap\">\n" +
                "  ";

       String res2 = "";
       for(int i=0; i< blogArticleService.getArticles().size(); i++){
          res2 =  res2 + blogArticleService.getArticle((long)i ).toHTMLCard()  ;
       }
        return res +"\n" +res2 +
                "</div>\n" +
                "</body>\n" +
                "</html>";
    }


}


