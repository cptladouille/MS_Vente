package org.cnam.MS_Vente.controller;

import org.cnam.MS_Vente.domain.Article;
import org.cnam.MS_Vente.dto.ArticleCreateResponse;
import org.cnam.MS_Vente.dto.ArticleResponse;
import org.cnam.MS_Vente.dto.CreateArticleRequest;
import org.cnam.MS_Vente.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/get/{id}")
    @ResponseBody
    public ArticleResponse getArticle(@PathVariable("id") Long id) {
        Article article = articleService.getArticle(id);
        ArticleResponse response =  new ArticleResponse(article.id, article.label, article.priceEOT);
        return response;
    }
    @PostMapping("/create")
    @ResponseBody
    public ArticleCreateResponse createNewArticle(@RequestBody CreateArticleRequest createArticleRequest) {
        Article article = articleService.createNewArticle(createArticleRequest.Label, createArticleRequest.PriceEOT);
        return new ArticleCreateResponse(article.id, article.label, article.priceEOT);
    }

}
