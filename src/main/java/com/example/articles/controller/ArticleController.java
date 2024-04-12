package com.example.articles.controller;

import com.example.articles.model.BlogArticle;
import com.example.articles.model.Commentaire;
import com.example.articles.service.BlogArticleService;
import com.example.articles.service.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path= "/article")
@Controller

public class ArticleController {
    private final BlogArticleService blogArticleService ;
    private final CommentaireService commentaireService ;

    @Autowired
    public ArticleController(BlogArticleService blogArticleService, CommentaireService commentaireService) {
        this.blogArticleService = blogArticleService;
        this.commentaireService = commentaireService;
        blogArticleService.create(new BlogArticle(0L,"Créez une application Java avec Spring Boot",
                "https://user.oc-static.com/upload/2020/11/12/16051678148864_4C4_Testez%20et%20d%E2%94%9C%C2%AEployez%20votre%20application.png",
                "Créez une application Java avec Spring Boot.............................."));

        blogArticleService.create(new BlogArticle(1L,"How to read JSON data in Spring Boot and write to a database",
                "",
                ""));

        blogArticleService.create(new BlogArticle(2L,"Expression de la motivation for job trainer",
                "https://www.esce.fr/wp-content/uploads/sites/11/2022/03/reflexion-dossier-sesame.jpg",
                ""));

        blogArticleService.create(new BlogArticle(3L,"Comment rédiger un cahier des charges",
                "https://www.lafabriquedunet.fr/wp-content/uploads/2022/11/objectifs-smart-art-rediger-cahier-des-charges.png",
                ""));

        blogArticleService.create(new BlogArticle(4L,"How Do Web Sessions Work? | Hazelcast",
                "https://hazelcast.com/wp-content/uploads/2021/12/diagram-Web-Sessions.png",
                ""));

        blogArticleService.create(new BlogArticle(5L,"Deployment definition & fonctionnement ",
                "https://www.weodeo.com/wp-content/uploads/2021/11/Virtualisation.jpg",
                ""));

        blogArticleService.create(new BlogArticle(6L,"Code propre & quality",
                "https://online.edhec.edu/wp-content/uploads/2022/07/pexels-luis-gomes-546819-1-1920x1275.jpg",
                ""));

        blogArticleService.create(new BlogArticle(7L,"Les cookies",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYvCKucG5SZAdKlbRKa0Schyj5D1tKozDGww&s",
                ""));

        blogArticleService.create(new BlogArticle(8L,"Protocole HTTP",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR59yYzlLJlZ3GL7ykUCtoc0vlVphzWVc2QQMrdjye6AQ&s",
                "" +
                        "Le protocole HTTP, pour HyperText Transfer Protocol, est un protocole de communication client-serveur qui permet d'accéder à des ressources situées sur un serveur Web. Aujourd'hui, on lui préfère le HTTPS, dont le S signifie Secured, il s'agit d'une variante sécurisée du protocole HTTP et qui s'appuie sur les protocoles TLS pour chiffrer les échanges entre le client et le serveur.\n" +
                        "</br></br>\n" +
                        "Pour communiquer avec un serveur Web au travers du protocole HTTP, on s'appuiera sur un client HTTP. Au quotidien, ce client HTTP prend la forme d'un navigateur Internet (Firefox, Chrome, Edge, etc...), même s'il existe de nombreux outils, notamment en ligne de commandes, capable d'effectuer des requêtes Web.\n" +
                        "</br></br>\n" +
                        "Depuis les débuts de l'Internet, le protocole HTTP (et maintenant le HTTPS) est utilisé sur les serveurs Web, notamment pour héberger un site Internet, que ce soit un blog, un site vitrine, ou un site d'e-commerce. Le HTTPS est recommandé, car il est sécurisé (échanges chiffrés) contrairement au HTTP.</br></br>"));

        blogArticleService.create(new BlogArticle(9L,"Méthode Scrum ",
                "https://bubbleplan.net/blog/wp-content/uploads/2018/05/430.jpeg",
                ""));

        blogArticleService.create(new BlogArticle(10L,"Méthode Agile ",
                "https://etcdigital.fr/wp-content/uploads/2022/01/MicrosoftTeams-image-10.jpg",
                ""));

        blogArticleService.create(new BlogArticle(11L,"Référencement SEO",
                "https://f.maformation.fr/edito/sites/3/2022/01/apprendre-referencement.jpeg",
                ""));

        blogArticleService.create(new BlogArticle(12L,"Test de connaissance Informatique ",
                "https://blog.lesjeudis.com/wp-content/uploads/2022/03/bilan-test-competences-informatiques.jpg",
                ""));

        blogArticleService.create(new BlogArticle(13L,"Différence entre Angular & React ",
                "https://integrio.net/static/img%20react%20vs%20angular-153402ea67e4341b0cf0e7effd693593.png",
                ""));

        blogArticleService.create(new BlogArticle(14L,"Sécurité informatique ",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Cybersecurity.png/1200px-Cybersecurity.png",
                ""));

        blogArticleService.create(new BlogArticle(15L,"Animation en CSS",
                "https://media.dev.to/cdn-cgi/image/width=1000,height=420,fit=cover,gravity=auto,format=auto/https%3A%2F%2Fdev-to-uploads.s3.amazonaws.com%2Fuploads%2Farticles%2Fulvbh5kb1wurvegzz7bs.png",
                ""));


    }


    @GetMapping(value= "{id}", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String article(@PathVariable(name = "id") Long id , Model model) {
            //  th:object="${foo}" in template and thymeleaf
            model.addAttribute("commentaire", new Commentaire());
            commentaireService.create(new Commentaire(1L, "Yilmaz",
                "yilmaz@gmail.com", "C'était très utile",
                1L));

        return "<!DOCTYPE html>\n" +
                "<html xmlns:th=\"http://www.thymeleaf.org\"><head>\n" +
                "    <title>Article</title>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\n" +
                "" +
                  "<style> #display-article{ margin: 50px auto; padding :30px;   text-align: center; width:800px; }"+
                " #display-article #titre{ margin-bottom: 70px; text-align:center;}" +
                " #display-article #image{ width:700px; height:auto; object-fit:cover;}" +
                " #display-article #contenu{ padding: 30px 0;} " +

                "#formCreationComments{ width:800px; margin: 50px auto; padding :30px;}" +
                ".div-all-comments{width:800px; margin: 50px auto; padding :30px;}" +
                ".div-all-comments h2{border-bottom: 0.2px solid black; padding: 8px 0; }" +
                ".div-all-comments .div-un-commentaire{ border-bottom: 0.2px solid black; margin: 15px 0;}" +
                ".div-all-comments .div-un-commentaire #auteur{color: #555;}" +
                ".div-all-comments .div-un-commentaire #message{ padding: 8px 0;}" +
                " </style>"+
                "</head>\n" +
                "<body>\n" +
                blogArticleService.getArticle(id).toHTMLPage()+
                commentaireService.ToHTMLListeCommentaires(id)+
                commentaireService.toCreateFormHTML()+
                "</body>\n" +
                "</html>";




    }


}


