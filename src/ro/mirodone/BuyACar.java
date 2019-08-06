package ro.mirodone;

public class BuyACar {

    public int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {

        double lossPercent = 0.5;
        int months = 0;
        double moneyLeft;
        double priceOld = startPriceOld;
        double priceNew = startPriceNew;
        double savings = 0;

        while ((priceOld + savings) < priceNew) {
            months++;

            if (months % 2 == 0) {
                percentLossByMonth = percentLossByMonth + lossPercent;
            }

            priceOld = priceOld - priceOld * (percentLossByMonth / 100);
            priceNew = priceNew - priceNew * (percentLossByMonth / 100);
            savings = savings + savingperMonth;
        }

        moneyLeft = (savings + priceOld) - priceNew;

        return new int[]{months, (int) Math.round(moneyLeft)};
    }


}
