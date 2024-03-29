package Entities.Products;

import Entities.Company;

import java.util.ArrayList;

public class ProductBuilder {
    protected final String Name;
    protected final String Description;
    protected final String productType;
    protected float Price;
    protected int Demand;
    protected int Stock;
    protected float productionCosts;
    public final Company Owner;

    public ProductBuilder(String Name, String  Description, String productType, Company Owner, ArrayList<Product> list){
        this.Name = Name;
        this.Description = Description;
        this.productType = productType;
        this.Owner = Owner;
        list.add(this.Build());
    }

    public ProductBuilder Price(float Price){
        this.Price = Price;
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
        return new Product(this);
    }
}
