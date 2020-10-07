package ru.lasttask.javamentor;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class Domain {


    public static void main(String[] args) throws Exception {

        CurrencyConverterService service = new CurrencyConverterService();

        Money eur = Money.of(CurrencyUnit.of("EUR"), 1000d);
        Money usd = Money.of(CurrencyUnit.of("USD"), 1000d);
        Money kgs = Money.of(CurrencyUnit.of("KGS"), 1000d);
        Money rub = Money.of(CurrencyUnit.of("RUB"), 1000d);

        System.out.println("Converter Test\n" + service.convertToRub(eur));
        System.out.println("Converter Test\n" + service.convertToRub(usd));
        System.out.println("Converter Test\n" + service.convertToRub(kgs));
        System.out.println("Converter Test\n" + service.convertToRub(rub));

    }
}
