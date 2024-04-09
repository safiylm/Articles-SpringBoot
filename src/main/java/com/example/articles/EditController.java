package com.example.articles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path= "/edit")
@Controller

public class EditController {
    @GetMapping("")
    @ResponseBody
    public String edit() {

        return "<!DOCTYPE html>\n" +
                "<html xmlns:th=\"http://www.thymeleaf.org\"><head>\n" +
                "    <title>Edit </title>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\n" +
                " <style> form{ margin: 50px auto; padding : 30px; width:600px; }" +
                "                \" h1{text-align:center;}</style> "+
                "</head>\n" +
                "<body>" +
                "<form action=\"#\" th:action=\"@{/blog-article-create}\" th:object=\"${blogarticle}\" method=\"post\">\n" +
                " <h1> Modifier l'article</h1>    " +
                "    <p>Titre: <input class=\"form-control\" type=\"text\" th:field=\"*{titre}\" /></p>\n" +
                "    <p>Image Url: <input class=\"form-control\" type=\"text\" th:field=\"*{photo}\" /></p>\n" +
                "    <p>Contenu: <input class=\"form-control\" type=\"text\" th:field=\"*{contenu}\" /></p>\n" +
                "    <p><input class=\"btn btn-secondary\" type=\"submit\" value=\"Submit\" /> " +
                "<input type=\"reset\" class=\"btn btn-light\" value=\"Reset\" /></p>\n" +
                "</form>"+
                "</body>\n" +
                "</html>";
    }

}
