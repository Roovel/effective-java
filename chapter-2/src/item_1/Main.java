package item_1;

/*
Item 1: Consider static factory methods instead of constructors.
This snippet shows the difference between using a class with a constructor and class with a static factory method
*/

public class Main {

    public static void main(String[] args) {

        CarConstructor carConstructor = new CarConstructor("Kia", 1995);

        CarStaticFactoryMethod carStaticFactoryMethod = CarStaticFactoryMethod.createCar("Kia", 1995);
    }
}
