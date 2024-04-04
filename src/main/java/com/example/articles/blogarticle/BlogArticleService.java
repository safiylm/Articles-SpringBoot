package com.example.articles.blogarticle;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogArticleService {

    List<BlogArticle> listeArticle = new ArrayList<>();


    //get all articles
    public List<BlogArticle> getArticles(){
        return listeArticle;
    }

    //add in arraylist the new article
    public BlogArticle create( BlogArticle article ){
        listeArticle.add(article);
        return article;
    }

    //Get BlogArticle of article in arraylist with id
    public BlogArticle getArticle( Long id){
        for (BlogArticle article: listeArticle
             ) {
                if(article.getId() == id){
                    return article;
                }
        }
        return null;
    }

    //Get Position of article in arraylist with id
    public int getIndexArticleInList( Long id){
        for (int i=0; i< listeArticle.size();i++ ) {
            if(listeArticle.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    //Get Id of last element in list
    public Long getLastIdOfArticle(){
        return listeArticle.get(listeArticle.size()-1).getId();
    }


    public BlogArticle update( Long id, BlogArticle article ){
       // Replaces (article) at the specified position ( position of article editing) in this list with the specified element.
        listeArticle.set( getIndexArticleInList(id),article );
        return article;
    }


    public void delete(Long id){
        //Get Position of article in arraylist with id
        // Remove Article at this position
        listeArticle.remove(getIndexArticleInList(id));
    }


}
