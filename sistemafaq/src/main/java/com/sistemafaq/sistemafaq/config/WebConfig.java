package com.sistemafaq.sistemafaq.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("http://localhost:3000") // ou restringir para seu frontend: http://localhost:4200
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }
}
