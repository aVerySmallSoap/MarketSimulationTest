package Entities.Products;
import Entities.Company;

import static Entities.Products.Product.companyProductHashMap;

public class ProductBuilder {
    protected final String Name;
    protected final String Description;
    protected float Price;
    protected float appreciatedValue;
    protected int Demand;
    protected int Stock;
    protected float productionCosts;

    protected final Company Owner;

    public ProductBuilder(String Name, String  Description, Company Owner){
        this.Name = Name;
        this.Description = Description;
        this.Owner = Owner;
    }

    public ProductBuilder Price(float Price){
        this.Price = Price;
        return this;
    }

    public ProductBuilder appValue(float appreciatedValue){
        this.appreciatedValue = appreciatedValue;
        return this;
    }

    public ProductBuilder Demand(int Demand){
        this.Demand = Demand;
        return this;
    }

    public ProductBuilder Stock(int Stock){
        this.Stock = Stock;
        return this;
    }

    public ProductBuilder productionCosts(float productionCosts){
        this.productionCosts = productionCosts;
        return this;
    }

    public Product Build(){
        Product product = new Product(this);
        return product;
    }
}
