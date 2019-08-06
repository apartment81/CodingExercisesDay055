package ro.mirodone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        BuyACar buyACar = new BuyACar();

        System.out.println(Arrays.toString(buyACar.nbMonths(2000, 8000, 1000, 1.5)));


    }
}
