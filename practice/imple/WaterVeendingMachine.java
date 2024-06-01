package practice.imple;
import java.util.List;
import practice.Product;
import practice.VendingMachine;

public class WaterVeendingMachine extends VendingMachine {
    public WaterVeendingMachine() {
        super();
    }

    public WaterVeendingMachine(List<Product> products) {
        super(products);
    }
}
