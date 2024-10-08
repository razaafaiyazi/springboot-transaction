package net.javaguides.springboot.controller;

import net.javaguides.springboot.dtos.OrderRequest;
import net.javaguides.springboot.dtos.OrderResponse;
import net.javaguides.springboot.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @PostMapping
    public ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest orderRequest){
        return ResponseEntity.ok(orderService.placeOrder(orderRequest));
    }
}
