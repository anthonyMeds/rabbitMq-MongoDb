package com.btgbackend.btgbackend.listener;

import com.btgbackend.btgbackend.listener.dto.OrderCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import static com.btgbackend.btgbackend.config.RabbitMqConfig.ORDER_CREAD_QUEUE;

@Component
public class OrderCreatedListener {

    private final Logger logger = LoggerFactory.getLogger(OrderCreatedListener.class);

    @RabbitListener(queues = ORDER_CREAD_QUEUE)
    public void listeN(Message<OrderCreatedEvent> message){
        logger.info("Message consumed: {}", message);
    }

}
