package com.example.articles.controller;

import com.example.articles.model.Commentaire;
import com.example.articles.service.CommentaireService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller //
@RequestMapping(path= "/commentaire")
public class CommentaireController {


    private final CommentaireService commentaireService ;

    public CommentaireController(CommentaireService commentaireService) {
        this.commentaireService = commentaireService;
    }

    @PostMapping(value = "/create", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody //

    public String create(@ModelAttribute Commentaire c ){
       // commentaireService.create(c);
        return "<!DOCTYPE html>" +c.toString();
    }


}
