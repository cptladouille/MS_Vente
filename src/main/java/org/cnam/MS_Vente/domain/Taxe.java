package org.cnam.MS_Vente.domain;

public class Taxe {

    public Long id;
    public float Amount;


    public Taxe(Long id, float amount) {
        this.id = id;
        this.Amount = amount;
    }

    public Taxe()
    {

    }
}
