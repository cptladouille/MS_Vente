package org.cnam.MS_Vente.service;


import org.cnam.MS_Vente.domain.Category;
import org.cnam.MS_Vente.domain.Order;
import org.cnam.MS_Vente.model.CategoryModel;
import org.cnam.MS_Vente.model.OrderModel;
import org.cnam.MS_Vente.repository.CategoryRepository;
import org.cnam.MS_Vente.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class CategoryService {

    private String createNewClientPath;

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryService()
    {

    }
    public Category createNewCategory(String label)
    {
        CategoryModel categoryModelToCreate = new CategoryModel(label);
        CategoryModel categoryModelSaved =  categoryRepository.save(categoryModelToCreate);
        return new Category(
                categoryModelSaved.getId(),
                categoryModelSaved.getLabel()
        );
    }
}