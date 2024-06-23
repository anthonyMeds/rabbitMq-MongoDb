package com.btgbackend.btgbackend.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    public static final String ORDER_CREAD_QUEUE = "btg-pactual-order-created";

    @Bean
    public Jackson2JsonMessageConverter jackson2JsonMessageConverter() {
       return new Jackson2JsonMessageConverter();
    }

}
