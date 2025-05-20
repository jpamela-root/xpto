package com.xpto.plsql.procedure;

public class CalculoSaldoProcedure {

    public static double calcularSaldo(double saldoAnterior, double valor, boolean isReceita) {
        if (isReceita) {
            return saldoAnterior + valor;
        } else {
            return saldoAnterior - valor;
        }
    }
}