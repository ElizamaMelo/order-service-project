package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Order {

    private String orderId;
    private String customerId;
    private List<Product> products;

    private String status;
    private double totalPrice;

    public Order(String orderId, String status) {
    }
}
