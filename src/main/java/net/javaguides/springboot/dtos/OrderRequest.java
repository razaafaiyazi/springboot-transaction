package net.javaguides.springboot.dtos;
import lombok.Getter;
import lombok.Setter;
import net.javaguides.springboot.entity.Order;
import net.javaguides.springboot.entity.Payment;

@Setter
@Getter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
