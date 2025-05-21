# Projeto XPTO - Sistema de Controle de Receitas e Despesas

## Descrição

O Projeto XPTO é uma aplicação corporativa desenvolvida em Java 8 com Spring Boot e banco de dados Oracle. 
O sistema permite o cadastro de pessoas físicas e jurídicas, movimentações bancárias e geração de relatórios financeiros como saldo consolidado e total de receitas.

## Funcionalidades

- Cadastro de clientes (Pessoa Física e Jurídica)
- Validação de documentos (CPF e CNPJ)
- Registro de movimentações financeiras (receitas e despesas)
- Geração de relatórios:
  - Saldo por cliente
  - Total de receitas
- Validação de dados de entrada com mensagens internacionalizadas
- Execução de procedures e functions em PL/SQL
- Arquitetura em camadas: DTOs, Services, Repositories, Controllers
- Testes com JUnit 5 e Mockito
- Integração com Oracle via chamada de função PL/SQL (`fn_saldo_total_cliente`)
- Endpoint: `GET /api/saldo/{idCliente}` retorna o saldo total do cliente com base nas movimentações


## Tecnologias Utilizadas

- Java 8
- Spring Boot
- Spring Web
- Spring Data JPA
- Oracle Database
- JDBC + JdbcTemplate
- Maven
- JUnit 5
- Mockito
- Maven 3.8+
- Banco Oracle (instância local ou remota)
- Postman (para testes de API)

##Testes de API

Você pode testar os endpoints usando o Postman ou Insomnia.
 Clientes

    GET /api/clientes

    GET /api/clientes/{id}

    POST /api/clientes

    PUT /api/clientes/{id}

    DELETE /api/clientes/{id}

 Movimentações

    GET /api/movimentacoes

    GET /api/movimentacoes/cliente/{idCliente}

    POST /api/movimentacoes

    DELETE /api/movimentacoes/{id}

Saldo do Cliente (via função PL/SQL)

    GET /api/saldo/{idCliente}
    → Retorna o saldo total (somatório das receitas e despesas) de um cliente específico utilizando uma função no banco Oracle.

##Scripts SQL

Os objetos PL/SQL utilizados estão localizados em:

  src/main/resources/db/scripts-plsql.sql


## Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/jpamela-root/xpto.git

2. Navegue até o diretório do projeto:

   cd xpto

3. Configure o banco de dados Oracle e atualize as credenciais no arquivo application.properties.

Execute a aplicação:

./mvnw spring-boot:run

4. Configure seu application.properties com as credenciais do banco Oracle:
 ```bash
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
spring.jpa.hibernate.ddl-auto=update

- Compile e execute o projeto:

./mvnw spring-boot:run

- Acesse a aplicação:

http://localhost:8080

