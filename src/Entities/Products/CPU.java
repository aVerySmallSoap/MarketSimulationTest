package Entities.Products;

public class CPU extends Product {
    String Skew;
    String Branding;
    int Cores;

    CPU(String Name,
        String Description,
        String Skew,
        String Branding,
        int Cores,
        float Price,
        float appreciatedValue,
        int Demand,
        int Stock,
        float productionCosts){
        super(Name, Description, Price, appreciatedValue, Demand, Stock, productionCosts);
        this.Skew = Skew;
        this.Branding = Branding;
        this.Cores = Cores;
    }
}