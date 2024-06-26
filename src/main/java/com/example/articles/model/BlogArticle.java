package com.example.articles.model;

import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Date;

public class BlogArticle {

    @Id

private Long Id;
    private String titre;
    private String photo;
    private String contenu;

    public BlogArticle(){}

    public BlogArticle(Long Id, String titre, String photo, String contenu){
            //, Date date
        this.Id = Id;
        this.titre =titre;
        this.photo = photo;
        this.contenu = contenu;
     //   this.date = date;
    }


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "BlogArticle{" +
                "titre='" + titre + '\'' +
                ", photo='" + photo + '\'' +
                ", contenu='" + contenu + '\'' +
                '}';
    }

    public String toHTMLPage() {
        return "<div id='display-article'>" +
                "<h1 id='titre'> " + titre +"</h1>"+
                "<img id='image' src='" + photo + '\'' +"/>"+
                "<div id='contenu'> " + contenu + "</div>" +
                "</div>"
                ;
    }

    public String toHTMLCard() {
        return "<div class=\"div-article\">" +
                "<img id='image' src='" + photo + '\'' +"/>"+
                "<a href='/article/"+getId()+"'> " + titre + "</a>" +
                "</div>"
                ;

    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getTitre() {
        return titre;
    }

    public String getPhoto() {
        return photo;
    }

    public String getContenu() {
        return contenu;
    }


}
