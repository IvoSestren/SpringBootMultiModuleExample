package br.com.strn.multimodule.gateway

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SpringCloudConfig {

    @Bean
    fun gatewayRoutes(builder: RouteLocatorBuilder): RouteLocator? {
        return builder.routes()
            .route { it.path("/customers/**").uri("lb://CUSTOMERS") }
            .route { it.path("/products/**").uri("lb://PRODUCTS") }
            .build()
    }
}