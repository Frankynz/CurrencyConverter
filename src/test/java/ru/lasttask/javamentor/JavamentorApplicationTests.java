package ru.lasttask.javamentor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;


class JavamentorApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    boolean testConverter() throws IOException, JSONException {
            return CurrencyConverter.convertToRub(1d,ValuteCharCode.USD).equals(CurrencyConverter.convertUSDtoRUB(1d));
    }

}
