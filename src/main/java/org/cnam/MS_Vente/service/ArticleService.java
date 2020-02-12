package org.cnam.MS_Vente.service;


import org.cnam.MS_Vente.domain.Article;
import org.cnam.MS_Vente.model.ArticleModel;
import org.cnam.MS_Vente.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    private String createNewClientPath;

    @Autowired
    private ArticleRepository articleRepository;

    public ArticleService()
    {

    }
    public Article createNewArticle(String label, float priceEOT)
    {
        ArticleModel articleModelToCreate = new ArticleModel(label,priceEOT);
        ArticleModel articleModelSaved = articleRepository.save(articleModelToCreate);
        return new Article(
                articleModelSaved.getId(),
                articleModelSaved.getLabel(),
                articleModelSaved.getPriceEOT()
        );
    }

    public Article getArticle(Long id)
    {
        ArticleModel articleModelSaved = articleRepository.getOne(id);
        return new Article(
                articleModelSaved.getId(),
                articleModelSaved.getLabel(),
                articleModelSaved.getPriceEOT()
        );
    }
}