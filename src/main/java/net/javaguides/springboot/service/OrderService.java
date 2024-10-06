package net.javaguides.springboot.service;

import net.javaguides.springboot.dtos.OrderRequest;
import net.javaguides.springboot.dtos.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
