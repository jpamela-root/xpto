package com.xpto.util;

public class CpfCnpjValidator {

    public static boolean isValidCpf(String cpf) {
        // Implementação fictícia
        return cpf != null && cpf.matches("\\d{11}");
    }

    public static boolean isValidCnpj(String cnpj) {
        // Implementação fictícia
        return cnpj != null && cnpj.matches("\\d{14}");
    }
}