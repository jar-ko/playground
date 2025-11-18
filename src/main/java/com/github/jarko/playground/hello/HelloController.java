package com.github.jarko.playground.hello;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class HelloController {

    private final RabbitTemplate rabbitTemplate;

    @PostMapping("/hello")
    public String hello() {
        log.info("Sending message to rabbitmq");

        rabbitTemplate.convertAndSend("hello.exchange", "hello.routingkey", "Hello World!");

        return "Hello World!";
    }
}
