import Entities.Company;
import Entities.Products.ProductBuilder;
import Lirys.Engine;

public class Main {

    static Engine engine = new Engine();
    ProductBuilder cpu = new ProductBuilder("AMD", "CDD", "CPU", Company.getCompany(0));
    public static void main(String[] args) {
        engine.Run();
        cpu.
    }
}
