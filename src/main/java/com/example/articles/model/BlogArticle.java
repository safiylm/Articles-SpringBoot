package com.example.articles.model;
import org.springframework.data.annotation.Id;

public class BlogArticle {

    @Id
    private Long Id;
    private String titre;
    private String url;

    public BlogArticle(Long Id, String titre, String url){
        this.Id = Id;
        this.titre =titre;
        this.url = url;
    }

    public Long getId() {
        return Id;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return " Article :" + titre;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public String getContenu() {
        return url;
    }


}
