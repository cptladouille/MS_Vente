package org.cnam.MS_Vente.service;


import org.cnam.MS_Vente.domain.Order;
import org.cnam.MS_Vente.domain.Promotion;
import org.cnam.MS_Vente.model.OrderModel;
import org.cnam.MS_Vente.model.PromotionModel;
import org.cnam.MS_Vente.repository.OrderRepository;
import org.cnam.MS_Vente.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Date;

@Service
public class OrderService {

    private String createNewClientPath;

    @Autowired
    private OrderRepository orderRepository;

    public OrderService()
    {

    }
    public Order createNewOrder(String orderNumber, Long idClient)
    {
        OrderModel orderModelToCreate = new OrderModel(orderNumber, idClient);
        OrderModel orderModelSaved =  orderRepository.save(orderModelToCreate);
        return new Order(
                orderModelSaved.getId(),
                orderModelSaved.getOrderNumber(),
                orderModelSaved.getIdClient()
        );
    }
}