package com.github.jarko.playground.api.hello

import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/hello")
interface HelloResource {
    @GET
    fun hello(): String
}
