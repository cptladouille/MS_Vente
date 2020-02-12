package org.cnam.MS_Vente.repository;

import org.cnam.MS_Vente.model.ArticleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<ArticleModel, Long> {



}
