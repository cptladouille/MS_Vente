package org.cnam.MS_Vente.service;


import org.cnam.MS_Vente.domain.Taxe;
import org.cnam.MS_Vente.model.TaxeModel;
import org.cnam.MS_Vente.repository.TaxeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxeService {

    private String createNewClientPath;

    @Autowired
    private TaxeRepository taxeRepository;

    public TaxeService()
    {

    }
    public Taxe createNewTaxe(float amount)
    {
        TaxeModel taxeModelToCreate = new TaxeModel(amount);
        TaxeModel taxeModelSaved =  taxeRepository.save(taxeModelToCreate);
        return new Taxe(
                taxeModelSaved.getId(),
                taxeModelSaved.getAmount()
        );
    }
}