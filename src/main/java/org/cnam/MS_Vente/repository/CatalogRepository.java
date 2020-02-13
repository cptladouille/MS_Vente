package org.cnam.MS_Vente.repository;

import org.cnam.MS_Vente.domain.Article;
import org.cnam.MS_Vente.model.CatalogModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface    CatalogRepository extends JpaRepository<CatalogModel, Long> {

}
