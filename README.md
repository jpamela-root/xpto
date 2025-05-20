#  Projeto XPTO - Sistema de Controle de Receitas e Despesas

## Descrição

O Projeto **XPTO** é uma aplicação corporativa desenvolvida em **Java 8** com **Spring Boot** e banco de dados **Oracle**, que simula o controle de **receitas** e **despesas** de clientes.
O sistema permite o cadastro de pessoas físicas e jurídicas, movimentações bancárias e geração de relatórios financeiros como saldo consolidado e total de receitas.

Este projeto pode ser utilizado como modelo para sistemas de gestão financeira corporativa.



## Funcionalidades

-  Cadastro de clientes (Pessoa Física e Jurídica)
-  Cadastro e validação de documentos (CPF e CNPJ)
-  Cadastro de movimentações financeiras (receitas e despesas)
-  Geração de relatórios:
  - Relatório de saldo por cliente
  - Relatório de total de receitas
-  Validação de dados de entrada com mensagens internacionalizadas
-  Execução de procedures e functions em PL/SQL
-  Camadas bem definidas: DTOs, Services, Repositories, Controllers
-  Testes com JUnit 5 e Mockito


Tecnologias Utilizadas

    Java 8

    Spring Boot 2.x

    Spring Data JPA

    Spring Web

    H2 (testes) / Oracle (produção)

    Lombok

    Flyway (migração de banco)

    JUnit 5 + Mockito

    Maven

Requisitos

    Java 8+

    Maven 3+

    Oracle Database (ou H2 para testes)


