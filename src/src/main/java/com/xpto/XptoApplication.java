package com.xpto;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal da aplicação XPTO.
 * Responsável por inicializar o contexto Spring Boot.
 */
@SpringBootApplication
public class XptoApplication {

    public static void main(String[] args) {
        SpringApplication.run(XptoApplication.class, args);
    }
}
