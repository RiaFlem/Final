package practice;
import java.util.ArrayList;
import java.util.List;

import practice.imple.HotDrinks;

public class VendingMachine {
    protected List<Product> products;

    public VendingMachine (List<Product> products) {
        this.products = products;
    }

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public void addProducts (List<Product> products) {
        this.products.addAll(products);
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct (String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                Product res = product;
                products.remove(product);
                return res;
            }
        }
        System.out.println("No such product " + name);
        return null;
    }

    public Product getProduct (String name, float volume, int temperature) {
        for (Product product : products) {
            if (product instanceof HotDrinks) {
                if (product.getName().equals(name) && ((HotDrinks) (product)).getVolume() == volume && ((HotDrinks) (product)).getTemperature() == temperature) {
                    Product res = product;
                    products.remove(product);
                    return res;
                }
            }
        }
        System.out.println("No such product " + name);
        return null;
    }
}
