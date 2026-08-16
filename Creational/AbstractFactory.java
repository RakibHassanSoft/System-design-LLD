package Creational;
// Product 1
interface Car {
    void drive();
}


// Product 2
interface Bike {
    void ride();
}


// Concrete Product
class NormalCar implements Car {

    @Override
    public void drive() {
        System.out.println("Driving Normal Car");
    }
}


// Concrete Product
class NormalBike implements Bike {

    @Override
    public void ride() {
        System.out.println("Riding Normal Bike");
    }
}


// Concrete Product
class LuxuryCar implements Car {

    @Override
    public void drive() {
        System.out.println("Driving Luxury Car");
    }
}


// Concrete Product
class LuxuryBike implements Bike {

    @Override
    public void ride() {
        System.out.println("Riding Luxury Bike");
    }
}


// Abstract Factory
interface VehicleFactory {

    Car createCar();

    Bike createBike();
}


// Concrete Factory 1
class NormalVehicleFactory implements VehicleFactory {

    @Override
    public Car createCar() {
        return new NormalCar();
    }

    @Override
    public Bike createBike() {
        return new NormalBike();
    }
}


// Concrete Factory 2
class LuxuryVehicleFactory implements VehicleFactory {

    @Override
    public Car createCar() {
        return new LuxuryCar();
    }

    @Override
    public Bike createBike() {
        return new LuxuryBike();
    }
}


// Client
public class AbstractFactory {

    public static void main(String[] args) {

        VehicleFactory factory =
                new LuxuryVehicleFactory();

        Car car = factory.createCar();
        car.drive();

        Bike bike = factory.createBike();
        bike.ride();
    }
}