package practice;
import java.time.LocalDate;
import java.util.List;
import practice.imple.BottleOfWater;
import practice.imple.HotDrinks;

public class ProductMain {
    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("родники", 55, LocalDate.of(2024, 5, 1));
        Product bottle2 = new BottleOfWater("родники", 55, LocalDate.of(2024, 5, 1),
            0.5f, "стекло", true);
        
        Product bottle3 = new HotDrinks("кофе", 120, LocalDate.of(2024, 6, 1),
            0.5f, "железо", false, 35);

        VendingMachine vn = new VendingMachine();
        //System.out.println(vn.getProducts());
        vn.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle3));
        System.out.println(vn.getProducts());
        System.out.println();

        vn.getProduct("родники");
        System.out.println(vn.getProducts());
        System.out.println();

        vn.getProduct("кофе", 0.5f, 35);
        System.out.println(vn.getProducts());
    }
}
