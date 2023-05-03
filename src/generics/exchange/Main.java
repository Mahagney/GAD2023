package generics.exchange;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        RON leu = new RON(200f);
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        try {
            System.out.println(exchangeDesk.convert(leu, USD.class));
            System.out.println(exchangeDesk.convert(leu, USD.class, 0.5f));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
