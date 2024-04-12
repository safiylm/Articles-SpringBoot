package com.example.articles.model;

public class Commentaire {

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    private Long Id;
    private String nomAuteur;
    private String emailAuteur;
    private String message ;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    private Long articleId;

    @Override
    public String
    toString() {
        return "Commentaire{" +
                "nomAuteur='" + nomAuteur + '\'' +
                ", emailAuteur='" + emailAuteur + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public Commentaire(){}

    public Commentaire(Long Id, String nomAuteur, String emailAuteur, String message , Long articleId){
        this.nomAuteur = nomAuteur;
        this.emailAuteur =emailAuteur;
        this.message = message;
        this.articleId = articleId;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public String getEmailAuteur() {
        return emailAuteur;
    }

    public void setEmailAuteur(String emailAuteur) {
        this.emailAuteur = emailAuteur;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toHTML() {
        return    "<div class='div-un-commentaire'> <div id='auteur'>"+ nomAuteur+" </div> <div id='message'>"+ message+ "</div></div>";

    }

}
