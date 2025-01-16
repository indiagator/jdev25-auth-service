package com.secor.jdev25authservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {


    @Bean
    public WebClient webClientUserService(WebClient.Builder webClientBuilder)
    {
        return webClientBuilder
                .baseUrl("http://localhost:8082/api/v1/get/user/details")
                .filter(new LoggingWebClientFilter())
                .build();
    }


}
