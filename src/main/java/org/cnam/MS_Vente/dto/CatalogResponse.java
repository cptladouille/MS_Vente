package org.cnam.MS_Vente.dto;

import org.cnam.MS_Vente.domain.Article;
import org.cnam.MS_Vente.model.ArticleModel;

import java.util.Set;

public class CatalogResponse {

    private String label;
    private Long id;
    private Set<ArticleModel> articles;

    public CatalogResponse(Long id, String label, Set<ArticleModel> articles) {
        this.label =label;
        this.id = id;
        this.articles = articles;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Set<ArticleModel> getArticles() {
        return articles;
    }

    public void setArticles(Set<ArticleModel> articles) {
        this.articles = articles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
