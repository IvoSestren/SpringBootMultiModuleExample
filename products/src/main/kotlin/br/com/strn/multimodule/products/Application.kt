package br.com.strn.multimodule.products

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
