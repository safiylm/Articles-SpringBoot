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
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQpKOjKBOX4lzBqQP-RbcdrvFav4nO1PQhs5g&s",
                "How to read JSON data in Spring Boot and write to a database.............................."));

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
