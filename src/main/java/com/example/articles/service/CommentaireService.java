package com.example.articles.service;

import com.example.articles.model.BlogArticle;
import com.example.articles.model.Commentaire;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentaireService {


    List<Commentaire> listeCommentaire = new ArrayList<>();


    //get all comments by articleId
    public List<Commentaire> getListeCommentaires(Long articleId ){
        List<Commentaire> newListe = new ArrayList<>();
        for (int i=0; i< listeCommentaire.size();i++ ) {
            if(listeCommentaire.get(i).getArticleId() == articleId){
               newListe.add(listeCommentaire.get(i));
            }
        }
        return newListe;
    }

    //get all comments by articleId
    public String ToHTMLListeCommentaires(Long articleId ){
        String res ="<div class='div-all-comments'>" +
                "<h2>Tous les commentaires </h2>";
        List<Commentaire> newListe = new ArrayList<>();
        for (int i=0; i< listeCommentaire.size();i++ ) {
            if(listeCommentaire.get(i).getArticleId() == articleId){
               res = res+ listeCommentaire.get(i).toHTML();
          }
        }
        return res +" </div>";
    }


    //add in arraylist the new article

    public Commentaire create( Commentaire c ){
        if (listeCommentaire.size()==0)
            c.setId(0L);
        else
            c.setId(getLastIdOfCommentaire()+1);
        listeCommentaire.add(c);
        return c;
    }


    //Get BlogArticle of article in arraylist with id
    public Commentaire getCommentaire( Long id){
       for (Commentaire commentaire: listeCommentaire
        ) {
            if(commentaire.getId() == id){
                return commentaire;
            }
        }
        return null;

    }


    //Get Position of article in arraylist with id
    public int getIndexCommentaireInList( Long id){
        for (int i=0; i< listeCommentaire.size();i++ ) {
            if(listeCommentaire.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }


    public String toCreateFormHTML() {
        return    "<form  action=\"/commentaire/create\" th:action=\"@{/commentaire/create}\"  "  +
                "th:object=\"${commentaire}\" " +
                "method=\"post\" id='formCreationComments'>\n" +
                " <h1> Ajouter un commentaire </h1>    " +
                "<p>Nom: <input class=\"form-control\" type=\"text\" th:field=\"*{nomAuteur}\" /></p>\n" +
                "    <p>Email: <input class=\"form-control\" type=\"text\" th:field=\"*{emailAuteur}\" /></p>\n" +
                "    <p>Message: <input class=\"form-control\" type=\"text\" th:field=\"*{message}\" /></p>\n" +
                "    <p>article Id: <input class=\"form-control\" type=\"number\" th:field=\"*{articleId}\" /></p>\n" +
                "    <p><input class=\"btn btn-secondary\" type=\"submit\" value=\"Submit\" />" +
                " <input type=\"reset\" class=\"btn btn-light\" value=\"Reset\" /></p>\n" +
                "</form>"
                ;

    }


    //Get Id of last element in list
    public Long getLastIdOfCommentaire(){
        return listeCommentaire.get(listeCommentaire.size()-1).getId();
    }

/*
    public Commentaire update( Long id, Commentaire c ){
        // Replaces (Commentaire) at the specified position ( position of Commentaire editing) in this list with the specified element.
        listeCommentaire.set( getIndexCommentaireInList(id),c );
        return c;
    }


    public void delete(Long id){
        //Get Position of Commentaire in arraylist with id
        // Remove Commentaire at this position
        listeCommentaire.remove(getIndexCommentaireInList(id));
    }
*/


}
