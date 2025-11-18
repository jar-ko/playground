package com.github.jarko.playground.config;

import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Declarables;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    @Bean
    public Declarables declarables() {
        Queue queue = QueueBuilder
                .durable("hello.queue")
                .build();
        Exchange exchange = ExchangeBuilder
                .directExchange("hello.exchange")
                .build();

        return new Declarables(
                queue,
                exchange,
                BindingBuilder
                        .bind(queue)
                        .to(exchange)
                        .with("hello.routingkey")
                        .noargs()
        );
    }
}
