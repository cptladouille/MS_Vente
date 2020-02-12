package org.cnam.MS_Vente.domain;

import java.util.Date;

public class Promotion {

    public Long id;
    public float amount;
    public Date startDate;
    public Date endDate;

    public Promotion(Long id, float amount, Date startDate, Date endDate) {
        this.id = id;
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Promotion()
    {

    }
}
