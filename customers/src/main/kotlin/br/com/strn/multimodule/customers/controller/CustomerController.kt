package br.com.strn.multimodule.customers.controller

import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customers")
class CustomerController(
    val env: Environment
) {
    @GetMapping
    fun findAll() : Map<Long, String>? {
        val port = env.getProperty("local.server.port")!!.toLong()

        val itens = HashMap<Long, String>()
        itens[1L] = "Customer 1"
        itens[2L] = "Customer 2"
        itens[3L] = "Customer 3"
        itens[4L] = "Customer 4"
        itens[port] = "Port"

        return itens;
    }
}