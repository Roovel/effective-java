package item_1;

public class CarStaticFactoryMethod {

    private final String brand;
    private final int year;

    private CarStaticFactoryMethod(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public static CarStaticFactoryMethod createCar(String brand, int year) {
        return new CarStaticFactoryMethod(brand, year);
    }
}
