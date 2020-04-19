package com.github.jarko.playground.service.hello

import com.github.jarko.playground.api.hello.HelloResource
import org.springframework.stereotype.Component

@Component
class HelloResourceImpl(private val helloService: HelloService) : HelloResource {
    override fun hello(): String {
        return helloService.hello()
    }
}
