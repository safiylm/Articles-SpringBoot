package com.example.articles.blogarticle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping(path= "/api/v1/article")

public class BlogArticleController {

    private final BlogArticleService blogArticleService ;

    @Autowired
    public BlogArticleController ( BlogArticleService blogArticleService ){
        this.blogArticleService = blogArticleService;
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
                ""));

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

    @GetMapping("/")
    public List<BlogArticle> getArticles(){
        return this.blogArticleService.getArticles();
    }


    @GetMapping("/{id}")
    public BlogArticle read(@PathVariable(name = "id") Long id) {
            return blogArticleService.getArticle(id);
    }
    @GetMapping("/create")
    public BlogArticle create() {
        // blogArticleService.getArticles().size()

        return blogArticleService.create(new BlogArticle((long) blogArticleService.getLastIdOfArticle()+1,
                "Improve your coding skills by building realistic projects",
                "https://www.frontendmentor.io/_next/image?url=%2Fstatic%2Fimages%2Fhome-hero.webp&w=3840&q=75",
                "Improve your coding skills by building realistic projects"));
    }


    @GetMapping("/update")
    public BlogArticle update() {
        return blogArticleService.update(1L, new BlogArticle((long) 1L,
                "Self-Improvement: How to Work On Yourself & Become Better",
                "https://www.frontendmentor.io/_next/image?url=%2Fstatic%2Fimages%2Fhome-hero.webp&w=3840&q=75",
                "Self-Improvement: How to Work On Yourself & Become Better"));
    }

    @GetMapping("/delete/{id}")
    public List<BlogArticle> delete(@PathVariable(name = "id") Long id) {
        this.blogArticleService.delete(id);
        return this.blogArticleService.getArticles();
    }

/*

    @PostMapping("/")
    public ResponseEntity<BlogArticle> create(@RequestBody BlogArticle article)
            throws URISyntaxException {
        BlogArticle createdArticle = blogArticleService.create(article);
        if (createdArticle == null) {
            return ResponseEntity.notFound().build();
        } else {
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(createdArticle.getId())
                    .toUri();

            return ResponseEntity.created(uri)
                    .body(createdArticle);
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<BlogArticle> update(@RequestBody BlogArticle article, @PathVariable(name = "id") Long id) {
        BlogArticle updatedArticle = blogArticleService.update(id, article);
            if (updatedArticle == null) {
            return ResponseEntity.notFound().build();
            } else {
            return ResponseEntity.ok(updatedArticle);
            }
}

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteArticle(@PathVariable(name = "id") Long id) {
        blogArticleService.delete(id);
        return ResponseEntity.noContent().build();
    }
*/
}
