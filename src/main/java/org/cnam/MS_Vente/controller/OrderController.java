package org.cnam.MS_Vente.controller;


import org.cnam.MS_Vente.domain.Article;
import org.cnam.MS_Vente.domain.Order;
import org.cnam.MS_Vente.dto.ArticleResponse;
import org.cnam.MS_Vente.dto.OrderResponse;
import org.cnam.MS_Vente.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/get/{id}")
    @ResponseBody
    public OrderResponse getOrder(@PathVariable("id") Long id) {
        Order order = orderService.getOrder(id);
        OrderResponse response =  new OrderResponse(order.id, order.orderNumber, order.isPaid,order.idClient, order.articles );
        return response;
    }

    @GetMapping("/pay/{id}")
    @ResponseBody
    public OrderResponse payOrder(@PathVariable("id") Long id) {
        Order order = orderService.payOrder(id);
        OrderResponse response =  new OrderResponse(order.id, order.orderNumber, order.isPaid,order.idClient, order.articles );
        return response;
    }

}
