package Entities.Products;
import Entities.Company;
public class Product {
    private final String Name;
    private final String Description;
    private final String productType;
    private float appreciatedValue;
    private final float Price;
    private final int Stock;
    private final float productionCosts;
    private ProductBuilder product;

    public Product(ProductBuilder builder){
        this.Name = builder.Name;
        this.Description = builder.Description;
        this.productType = builder.productType;
        this.Price = builder.Price;
        this.Stock = builder.Stock;
        this.appreciatedValue = 1;
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

    public float getAppreciatedValue(){
        return appreciatedValue;
    }

    public void setAppreciatedValue(float x){
        this.appreciatedValue = x;
    }

    public int getStock() {
        return Stock;
    }

    public float getProductionCosts() {
        return productionCosts;
    }

    public Company getCompanyOwner(){
        return product.Owner;
    }

}
