package org.cnam.MS_Vente.repository;

import org.cnam.MS_Vente.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryModel, Long> {

}
