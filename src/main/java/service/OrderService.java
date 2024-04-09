package service;

import model.OrderEvent;
import model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private KafkaTemplate<String, OrderEvent> kafkaTemplate;

    public void createOrder(Order order) {

        //save order in db
        // Enviar evento para o Kafka
        kafkaTemplate.send("order-events", new OrderEvent(order.getOrderId(), "CREATED"));
    }
}
