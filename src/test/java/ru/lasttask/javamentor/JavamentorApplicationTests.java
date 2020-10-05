package ru.lasttask.javamentor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.test.context.SpringBootTest;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import java.io.IOException;


class JavamentorApplicationTests {

    @Test
    void contextLoads() {
    }


    @Test
    public void givenCurrencyCode_whenString_thanExist() {
        CurrencyUnit usd = Monetary.getCurrency("USD");

        System.out.println(usd);
    }

}
