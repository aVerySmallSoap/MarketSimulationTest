package Entities.Products;

import Entities.Company;

import java.util.HashMap;

public class Product {

    HashMap<Company, Product> companyProductHashMap = new HashMap<>();
    String Name;
    String Description;
    float Price;
    float appreciatedValue;
    int Demand;
    int Stock;
    float productionCosts;

    Product(String Name,
            String Description,
            float Price,
            float appreciatedValue,
            int Demand,
            int Stock,
            float productionCosts,
            Company Owner){
        this.Name = Name;
        this.Description = Description;
        this.Price = Price;
        this.appreciatedValue = appreciatedValue;
        this.Demand = Demand;
        this.Stock = Stock;
        this.productionCosts = productionCosts;
        companyProductHashMap.put(Owner, this);
    }
}
