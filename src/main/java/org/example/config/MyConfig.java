package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;



@Configuration
@ComponentScan("org.example")
public class MyConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    @Bean
    public HttpHeaders httpHeaders() {
        return new HttpHeaders();
    }
}
