CREATE OR REPLACE PROCEDURE calcular_saldo_cliente (
    p_cliente_id IN NUMBER,
    p_saldo OUT NUMBER
) AS
BEGIN
SELECT NVL(SUM(
                   CASE tipo
                       WHEN 'RECEITA' THEN valor
                       WHEN 'DESPESA' THEN -valor
                       ELSE 0
                       END
           ), 0)
INTO p_saldo
FROM movimentacoes
WHERE cliente_id = p_cliente_id;
END;
/
