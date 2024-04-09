package controller;

import model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.OrderService;

@RestController
@RequestMapping(value = "/api/v1/order")
public class OrderController {

    @Autowired
    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }
    @PostMapping("/post")
    public void postOrder(@RequestBody Order order) {
        service.createOrder(order);
    }
}
