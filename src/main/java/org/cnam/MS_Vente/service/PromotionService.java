package org.cnam.MS_Vente.service;


import org.cnam.MS_Vente.domain.Promotion;
import org.cnam.MS_Vente.domain.Taxe;
import org.cnam.MS_Vente.model.PromotionModel;
import org.cnam.MS_Vente.model.TaxeModel;
import org.cnam.MS_Vente.repository.PromotionRepository;
import org.cnam.MS_Vente.repository.TaxeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Date;

@Service
public class PromotionService {

    private String createNewClientPath;

    @Autowired
    private PromotionRepository promotionRepository;

    public PromotionService()
    {

    }
    public Promotion createNewPromotion(float amount, Date startDate, Date endDate)
    {
        PromotionModel promotionModelToCreate = new PromotionModel(amount, startDate, endDate);
        PromotionModel promotionModelSaved =  promotionRepository.save(promotionModelToCreate);
        return new Promotion(
                promotionModelSaved.getId(),
                promotionModelSaved.getAmount(),
                promotionModelSaved.getStartDate(),
                promotionModelSaved.getEndDate()
        );
    }
}