package ru.lasttask.javamentor;

import org.springframework.boot.configurationprocessor.json.JSONException;

import java.io.IOException;

public class Domain {
    public static void main(String[] args) throws IOException, JSONException {

        System.out.println("Converter Test\n"+ CurrencyConverter.convertToRub(1.9d,ValuteCharCode.USD));
        System.out.println("Converter Test\n"+ CurrencyConverter.convertUSDtoRUB(1d));

        System.out.println("Converter Test\n"+ CurrencyConverter.convertToRub(1d,ValuteCharCode.EUR));
        System.out.println("Converter Test\n"+ CurrencyConverter.convertEURtoRUB(1d));



    }
}
