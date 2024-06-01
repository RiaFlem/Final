package practice.imple;
import java.time.LocalDate;

import practice.Product;

public class HotDrinks extends Product {
    public float volume;
    private String pack;
    public boolean isSparkling;
    public int temperature;

    // public HotDrinks(String name, double price, LocalDate releaseData) {
    //     super(name, price, releaseData);
    //     this.volume = 0;
    //     this.pack = null;
    //     this.isSparkling = false;
    //     this.temperature = 0;
    // }

    public HotDrinks(String name, double price, LocalDate releaseData, float volume, String pack, boolean isSparkling, int temperature) {
        super(name, price, releaseData);
        this.volume = volume;
        this.pack = pack;
        this.isSparkling = isSparkling;
        this.temperature = temperature;
    }

    public Float getVolume() {
        return volume;
    }

    public boolean isSpark() {
        return isSparkling;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Product {name = '" + name + '\'' + 
        ", price = " + price +
        ", releaseData = " + releaseData +
        ", volume = " + volume +
        ", pack = '" + pack + '\'' +
        ", isSpark = " + isSparkling +
        ", temp = " + temperature +
        "}";
    }
}
