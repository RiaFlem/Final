package practice.imple;
import java.util.List;
import practice.Product;
import practice.VendingMachine;

public class HotDrinksVendingMachine extends VendingMachine {
    List<HotDrinks> hotDrinks;
    public HotDrinksVendingMachine() {
        super();
    }
    
    public HotDrinksVendingMachine(List<Product> products) {
        super(products);
    }
}