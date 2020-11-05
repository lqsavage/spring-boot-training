package com.example.threadsafe.config;

import com.example.threadsafe.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public User user(){
        return new User();
    }
}
