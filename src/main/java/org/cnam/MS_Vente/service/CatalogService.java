package org.cnam.MS_Vente.service;


import org.cnam.MS_Vente.domain.Article;
import org.cnam.MS_Vente.domain.Catalog;
import org.cnam.MS_Vente.model.ArticleModel;
import org.cnam.MS_Vente.model.CatalogModel;
import org.cnam.MS_Vente.repository.ArticleRepository;
import org.cnam.MS_Vente.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {

    private String createNewClientPath;

    @Autowired
    private CatalogRepository catalogRepository;

    public CatalogService()
    {

    }
    public Catalog createNewArticle()
    {
        CatalogModel catalogModelToCreate = new CatalogModel();
        CatalogModel catalogModelSaved = catalogRepository.save(catalogModelToCreate);
        return new Catalog(
                catalogModelSaved.getId(),
                catalogModelSaved.getLabel()
        );
    }
}