-- Função: Retorna o saldo total de um cliente com base nas movimentações

CREATE OR REPLACE FUNCTION fn_saldo_total_cliente(p_id_cliente NUMBER)
RETURN NUMBER IS
  v_saldo NUMBER := 0;
BEGIN
SELECT NVL(SUM(valor), 0)
INTO v_saldo
FROM movimentacao
WHERE id_cliente = p_id_cliente;

RETURN v_saldo;
END;
/
