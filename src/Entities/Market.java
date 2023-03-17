package Entities;

public class Market {
    private final boolean isCRASHING = false;
    private final boolean isGROWING = true;
    private float marketSaturation; //Higher = lower customers, vice versa. R[0-1]
    private int Demand;

    public static int numberOfCustomers;

    public void expectedCustomers(float marketSaturation, int totalNumProducts, int Demand){
        int baseCustomers = 50_000;
        if(marketSaturation < 1){
            numberOfCustomers = (int) ((totalNumProducts * (marketSaturation / Demand)) * 100) + baseCustomers;
        }else{
            numberOfCustomers = (totalNumProducts * Demand) / 100 + baseCustomers;
        }
    }
}
