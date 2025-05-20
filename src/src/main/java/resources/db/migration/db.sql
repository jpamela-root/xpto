CREATE TABLE clientes (
                          id NUMBER PRIMARY KEY,
                          nome VARCHAR2(100),
                          tipo VARCHAR2(20),
                          documento VARCHAR2(20),
                          email VARCHAR2(100),
                          telefone VARCHAR2(20)
);

CREATE TABLE enderecos (
                           id NUMBER PRIMARY KEY,
                           cliente_id NUMBER,
                           rua VARCHAR2(100),
                           numero VARCHAR2(10),
                           complemento VARCHAR2(50),
                           bairro VARCHAR2(50),
                           cidade VARCHAR2(50),
                           estado VARCHAR2(2),
                           cep VARCHAR2(10),
                           CONSTRAINT fk_cliente FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);

CREATE TABLE movimentacoes (
                               id NUMBER PRIMARY KEY,
                               cliente_id NUMBER,
                               tipo VARCHAR2(20),
                               valor NUMBER,
                               data DATE,
                               CONSTRAINT fk_cliente_mov FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);
