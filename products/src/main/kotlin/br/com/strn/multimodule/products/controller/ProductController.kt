package br.com.strn.multimodule.products.controller

import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductController(
    val env: Environment
) {
    @GetMapping
    fun findAll() : Map<Long, String>? {
        val port = env.getProperty("local.server.port")!!.toLong()

        val itens = HashMap<Long, String>()
        itens[1L] = "Product 1"
        itens[2L] = "Product 2"
        itens[3L] = "Product 3"
        itens[4L] = "Product 4"
        itens[port] = "Port"

        return itens;
    }
}