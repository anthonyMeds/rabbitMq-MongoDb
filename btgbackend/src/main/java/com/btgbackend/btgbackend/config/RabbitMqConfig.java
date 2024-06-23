package com.btgbackend.btgbackend.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    public static final String ORDER_CREAD_QUEUE = "btg-pactual-order-created";

}
