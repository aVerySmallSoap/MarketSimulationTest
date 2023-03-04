package Entities.Products;

public class Product {
    String Name = null;
    String Description = null;
    float Price = 0;
    float appreciatedValue = 0;
    int Demand = 0;
    int Stock = 0;
    float productionCosts = 0;

    Product(String Name,
            String Description,
            float Price,
            float appreciatedValue,
            int Demand,
            int Stock,
            float productionCosts){
        this.Name = Name;
        this.Description = Description;
        this.Price = Price;
        this.appreciatedValue = appreciatedValue;
        this.Demand = Demand;
        this.Stock = Stock;
        this.productionCosts = productionCosts;
    }
}
