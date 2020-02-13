package org.cnam.MS_Vente.controller;

import org.cnam.MS_Vente.domain.Article;
import org.cnam.MS_Vente.domain.Catalog;
import org.cnam.MS_Vente.dto.ArticleCreateResponse;
import org.cnam.MS_Vente.dto.ArticleResponse;
import org.cnam.MS_Vente.dto.CatalogResponse;
import org.cnam.MS_Vente.dto.CreateArticleRequest;
import org.cnam.MS_Vente.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/get/{id}")
    @ResponseBody
    public CatalogResponse getCatalog(@PathVariable("id") Long id) {
        Catalog catalog = catalogService.getCatalog(id);
        CatalogResponse response =  new CatalogResponse(catalog.id,catalog.label,catalog.articles);
        return response;
    }

}
