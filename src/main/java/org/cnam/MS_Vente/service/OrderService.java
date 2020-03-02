package org.cnam.MS_Vente.service;


import org.aspectj.bridge.ICommand;
import org.cnam.MS_Vente.domain.Article;
import org.cnam.MS_Vente.domain.Order;
import org.cnam.MS_Vente.domain.Order;
import org.cnam.MS_Vente.domain.Promotion;
import org.cnam.MS_Vente.model.ArticleModel;
import org.cnam.MS_Vente.model.OrderModel;
import org.cnam.MS_Vente.model.OrderModel;
import org.cnam.MS_Vente.model.PromotionModel;
import org.cnam.MS_Vente.repository.OrderRepository;
import org.cnam.MS_Vente.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Date;
import java.util.Set;

@Service
public class OrderService {

    private String createNewClientPath;

    @Autowired
    private OrderRepository orderRepository;

    public OrderService()
    {

    }
    public Order getOrder(Long id)
    {
        OrderModel orderModelSaved = orderRepository.getOne(id);
        return new Order(
                orderModelSaved.getId(),
                orderModelSaved.getOrderNumber(),
                orderModelSaved.getIdClient(),
                orderModelSaved.getPaid(),
                orderModelSaved.getArticles()
        );
    }
    public Order payOrder(Long id)
    {
        OrderModel orderModelToPay = orderRepository.getOne(id);
        orderModelToPay.setPaid(true);
        OrderModel orderModelSaved = orderRepository.save(orderModelToPay);
        return new Order(
                orderModelSaved.getId(),
                orderModelSaved.getOrderNumber(),
                orderModelSaved.getIdClient(),
                orderModelSaved.getPaid(),
                orderModelSaved.getArticles()
        );
    }


    public Order createNewOrder(Long idClient, Set<ArticleModel> Articles)
    {
        OrderModel orderModelToCreate = new OrderModel(idClient,Articles);
        orderModelToCreate.setPaid(false);
        double commandNumber = Math.round(Math.random() * ((1000000 - 100000)) + 1000000);
        orderModelToCreate.setOrderNumber(String.valueOf(commandNumber));
        OrderModel orderModelSaved = orderRepository.save(orderModelToCreate);
        return new Order(
                orderModelSaved.getId(),
                orderModelSaved.getOrderNumber(),
                orderModelSaved.getIdClient(),
                orderModelSaved.getPaid(),
                orderModelSaved.getArticles()
                );
    }
}