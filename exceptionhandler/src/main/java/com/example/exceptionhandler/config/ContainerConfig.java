package com.example.exceptionhandler.config;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ContainerConfig {
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
        return factory -> {
            ErrorPage[] errorPages = new ErrorPage[2];
            errorPages[0] = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/error/500");
            errorPages[1] = new ErrorPage(HttpStatus.NOT_FOUND, "/error/404");
            factory.addErrorPages(errorPages);
        };
    }
}
