package com.example.articles.service;

import com.example.articles.model.BlogArticle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogArticleService {

    List<BlogArticle> listeArticle = new ArrayList<>();


    //get all articles
    public List<BlogArticle> getArticles(){
        create(new BlogArticle(0L,"How Do Web Sessions Work? | Hazelcast",
                "https://hazelcast.com/foundations/software-architecture/web-session/"));

        create(new BlogArticle(1L,"Les cookies",
                "https://www.kaspersky.fr/resource-center/definitions/cookies"));

        create(new BlogArticle(2L,"Référencement SEO",
                "https://www.seo.fr/definition/comprendre-referencement"));

        create(new BlogArticle(3L,"Link URLs",
                "https://www.thymeleaf.org/doc/tutorials/2.1/usingthymeleaf.html#link-urls"));

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
