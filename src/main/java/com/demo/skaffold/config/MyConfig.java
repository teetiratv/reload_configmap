package com.demo.skaffold.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "bean")
@Data
public class MyConfig {

    private String message = "Hello Default";

}
