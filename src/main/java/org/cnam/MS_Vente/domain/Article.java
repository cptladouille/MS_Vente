package org.cnam.MS_Vente.domain;

public class Article {

    public Long id;
    public String label;
    public float priceEOT;

    public Article(Long id,String label,float priceEOT)
    {
        this.id = id;
        this.label = label;
        this.priceEOT = priceEOT;
    }

    public Article()
    {

    }
}
