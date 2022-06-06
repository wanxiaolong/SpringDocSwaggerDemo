package com.demo.springdoc.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().info(info());
    }

    private Info info() {
        return new Info()
                .title("My Open API Title")
                .description("My Open API Description")
                .version("1.0.0")
                .contact(new Contact()
                        .name("MyName")
                        .email("MyEmailName@163.com")
                        .url("http://myhomepage.com"))
                .termsOfService("Terms of Service")
                .license(new License()
                        .name("Apache v2")
                        .url("#"));
    }
}
