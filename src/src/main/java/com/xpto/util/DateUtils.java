package com.xpto.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static LocalDate parse(String dateStr) {
        return LocalDate.parse(dateStr, formatter);
    }

    public static String format(LocalDate date) {
        return date.format(formatter);
    }
}

