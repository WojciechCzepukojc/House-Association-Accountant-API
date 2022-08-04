package com.example.flat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()

                //TODO: "basePackage" to pakiet glowny gdzie znajduja sie controllery
                // w tym przypadku jest to "com.example.flat.controllers"
                // konfigurujemy to bo inaczej swagger nie bedzie widzial jakie endpointy maja byc udokumentowane

                .apis(RequestHandlerSelectors.basePackage("com.example.flat.config"))
                .paths(PathSelectors.any())
                .build();
    }

}
//TODO: swagger bedzie uruchomiony na tym samym porcie co applikacja http://localhost:8082/swagger-ui/index.html
//http://localhost:8010/swagger-ui/index.html
