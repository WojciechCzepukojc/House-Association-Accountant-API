//package com.example.commons.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.example.commons.config"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//}
//http://localhost:8080/swagger-ui/index.html



/*
TODO: do usuniecia - w commonsach nie potrzebujesz configu swaggera,
 jako ze tu nie powinny znajdowac sie zadne endpointy ani controllery.
*/
