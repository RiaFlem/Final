package practice.imple;
import java.time.LocalDate;
import practice.Product;

public class BottleOfWater extends Product {
    public float volume;
    private String pack;
    public boolean isSparkling;

    public BottleOfWater (String name, double price, LocalDate releaseData) {
        super(name, price, releaseData);
        this.volume = 1;
        this.pack = null;
        this.isSparkling = false;
    }

    public BottleOfWater (String name, double price, LocalDate releaseData, float volume, String pack, boolean isSparkling) {
        super(name, price, releaseData);
        this.volume = volume;
        this.pack = pack;
        this.isSparkling = isSparkling;
    }

    public Float getVolume() {
        return volume;
    }

    public boolean isSpark() {
        return isSparkling;
    }

    @Override
    public String toString() {
        return "Product {name = '" + name + '\'' + 
        ", price = " + price +
        ", releaseData = " + releaseData +
        ", volume = " + volume +
        ", pack = '" + pack + '\'' +
        ", isSpark = " + isSparkling +
        "}";
    }
}
