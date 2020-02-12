package org.cnam.MS_Vente.domain;

public class Order {

    public Long id;
    public String orderNumber;
    public Long idClient;

    public Order(Long id, String orderNumber, Long idClient) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.idClient = idClient;
    }

    public Order()
    {

    }
}
