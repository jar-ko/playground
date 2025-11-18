package com.github.jarko.playground.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class HelloListener {

    @RabbitListener(queues = "hello.queue")
    public void receiveMessage(String message) {
        log.info("Received message: {}", message);

        Mono
                .just(message)
                .doOnNext(m -> log.info("Processing message: {}", m))
                .subscribe();
    }
}
