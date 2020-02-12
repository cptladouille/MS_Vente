package org.cnam.MS_Vente.dto;

public class ArticleResponse {

    private String label;
    private float priceEOT;
    private Long id;

    public ArticleResponse(Long id, String label, float priceEOT) {
        this.label =label;
        this.priceEOT = priceEOT;
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public float getPriceEOT() {
        return priceEOT;
    }

    public void setPriceEOT(float priceEOT) {
        this.priceEOT = priceEOT;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
