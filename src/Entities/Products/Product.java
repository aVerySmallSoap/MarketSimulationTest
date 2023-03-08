package Entities.Products;

import Entities.Company;

import java.util.HashMap;

public class Product {

    static HashMap<Company, Product> companyProductHashMap = new HashMap<>();
    private final String Name;
    private final String Description;
    private final float Price;
    private final float appreciatedValue;
    private final int Demand;
    private final int Stock;
    private final float productionCosts;

    Product(ProductBuilder builder){
        this.Name = builder.Name;
        this.Description = builder.Description;
        this.Price = builder.Price;
        this.appreciatedValue = builder.appreciatedValue;
        this.Demand = builder.Demand;
        this.Stock = builder.Stock;
        this.productionCosts = builder.productionCosts;
        companyProductHashMap.put(builder.Owner, this);
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public float getPrice() {
        return Price;
    }

    public float getAppreciatedValue() {
        return appreciatedValue;
    }

    public int getDemand() {
        return Demand;
    }

    public int getStock() {
        return Stock;
    }

    public float getProductionCosts() {
        return productionCosts;
    }
}
