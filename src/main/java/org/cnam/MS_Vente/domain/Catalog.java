package org.cnam.MS_Vente.domain;

import org.cnam.MS_Vente.model.ArticleModel;

import java.util.List;
import java.util.Set;

public class Catalog {

    public Long id;
    public String label;
    public Set<ArticleModel> articles;

    public Catalog(Long id, String label)
    {
        this.id = id;
        this.label = label;
    }
    public Catalog(Long id, String label, Set<ArticleModel> articles)
    {
        this.id = id;
        this.label = label;
        this.articles = articles;
    }

    public Catalog()
    {

    }

}
