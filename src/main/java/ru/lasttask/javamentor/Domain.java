package ru.lasttask.javamentor;

import org.joda.money.CurrencyUnit;
import org.springframework.boot.configurationprocessor.json.JSONException;

import java.io.IOException;
import java.math.BigDecimal;

public class Domain {
    public static void main(String[] args) throws IOException, JSONException {

        System.out.println("Converter Test\n"+ CurrencyConverter.convertToRub(BigDecimal.valueOf(1.9), CurrencyUnit.USD));
        System.out.println("Converter Test\n"+ CurrencyConverter.convertToRub(BigDecimal.valueOf(1.239),CurrencyUnit.USD));
        System.out.println("Converter Test\n"+ CurrencyConverter.convertToRub(BigDecimal.valueOf(1.1231239),CurrencyUnit.USD));
        System.out.println("Converter Test\n"+ CurrencyConverter.convertUSDtoRUB(BigDecimal.valueOf(1)));
        System.out.println("Converter Test\n"+ CurrencyConverter.convertToRub(BigDecimal.valueOf(2),CurrencyUnit.EUR));
        System.out.println("Converter Test\n"+ CurrencyConverter.convertEURtoRUB(BigDecimal.valueOf(2)));




    }
}
