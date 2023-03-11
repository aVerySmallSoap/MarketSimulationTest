import Entities.Company;
import Entities.Products.Product;
import Entities.Products.ProductBuilder;
import Lirys.Engine;

public class Main {

    static Engine engine = new Engine();
    public static void main(String[] args) {
        engine.Run();
        System.out.println(new Product(new ProductBuilder("i7-13700k", "Intel CPU", "CPU", Company.getCompany(1))
                .Price(200)));
    }
}
