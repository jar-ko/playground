package com.github.jarko.playground.service

import com.github.jarko.playground.service.hello.HelloResourceImpl
import org.glassfish.jersey.server.ResourceConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration

@SpringBootApplication
class PlaygroundServiceApplication

fun main(args: Array<String>) {
    runApplication<PlaygroundServiceApplication>(*args)
}

@Configuration
class JerseyConfig : ResourceConfig() {
    init {
        registerResources()
    }

    private fun registerResources() {
        register(HelloResourceImpl::class.java)
    }
}
