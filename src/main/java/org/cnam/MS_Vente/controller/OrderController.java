package org.cnam.MS_Vente.controller;


import org.cnam.MS_Vente.domain.Order;
import org.cnam.MS_Vente.domain.Order;
import org.cnam.MS_Vente.dto.OrderCreateResponse;
import org.cnam.MS_Vente.dto.OrderResponse;
import org.cnam.MS_Vente.dto.CreateOrderRequest;
import org.cnam.MS_Vente.dto.OrderResponse;
import org.cnam.MS_Vente.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        OrderResponse response =  new OrderResponse(order.id, order.orderNumber, order.isPaid,order.idClient, order.articles);
        return response;
    }

    @GetMapping("/pay/{id}")
    @ResponseBody
    public OrderResponse payOrder(@PathVariable("id") Long id) {
        Order order = orderService.payOrder(id);
        OrderResponse response =  new OrderResponse(order.id, order.orderNumber, order.isPaid,order.idClient, order.articles);
        return response;
    }

    @PostMapping("/create")
    @ResponseBody
    public OrderCreateResponse createNewOrder(@RequestBody CreateOrderRequest createOrderRequest) {
        Order order = orderService.createNewOrder(createOrderRequest.idClient, createOrderRequest.articles);
        return new OrderCreateResponse(order.id, order.idClient,order.orderNumber, order.isPaid, order.articles);
    }

}
