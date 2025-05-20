package com.xpto.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info().title("XPTO API REST")
                        .description("API para controle de receitas e despesas dos clientes da XPTO")
                        .version("v1.0")
                        .contact(new Contact()
                                .name("Equipe XPTO")
                                .email("contato@xpto.com")
                                .url("https://www.xpto.com"))
                        .license(new License()
                                .name("Licença XPTO")
                                .url("https://www.xpto.com/licenca")))
                .addServersItem(new Server().url("http://localhost:8080").description("Servidor local"))
                .externalDocs(new ExternalDocumentation()
                        .description("Documentação Completa")
                        .url("https://www.xpto.com/docs"));
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/clientes/**", "/contas/**", "/movimentacoes/**", "/relatorios/**")
                .build();
    }
}