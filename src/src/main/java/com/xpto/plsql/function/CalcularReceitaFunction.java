package com.xpto.plsql.function;

import java.util.List;

public class CalcularReceitaFunction {

    public static double calcularReceitaTotal(List<Double> receitas) {
        return receitas.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }
}