package Entities.Products;

public class Product {
    private final String Name;
    private final String Description;
    private final String productType;
    private final float Price;
    private final float appreciatedValue;
    private final int Demand;
    private final int Stock;
    private final float productionCosts;

    public Product(ProductBuilder builder){
        this.Name = builder.Name;
        this.Description = builder.Description;
        this.productType = builder.productType;
        this.Price = builder.Price;
        this.appreciatedValue = builder.appreciatedValue;
        this.Demand = builder.Demand;
        this.Stock = builder.Stock;
        this.productionCosts = builder.productionCosts;
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
