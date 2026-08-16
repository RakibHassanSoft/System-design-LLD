package Structural;

interface Coffee {

    String getDescription();

    double getCost();
}


// Concrete Component
class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}


// Base Decorator
abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}


// Concrete Decorator
class MilkDecorator extends CoffeeDecorator {

    MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.0;
    }
}


// Concrete Decorator
class SugarDecorator extends CoffeeDecorator {

    SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.5;
    }
}


// Concrete Decorator
class WhippedCreamDecorator extends CoffeeDecorator {

    WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 2.0;
    }
}


// Client
public class Decorator {

    public static void main(String[] args) {

        // Basic coffee
        Coffee coffee = new SimpleCoffee();

        System.out.println("Basic Coffee:");
        System.out.println(coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());

        System.out.println();


        // Add Milk
        coffee = new MilkDecorator(coffee);

        System.out.println("After adding Milk:");
        System.out.println(coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());

        System.out.println();


        // Add Sugar
        coffee = new SugarDecorator(coffee);

        System.out.println("After adding Sugar:");
        System.out.println(coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());

        System.out.println();


        // Add Whipped Cream
        coffee = new WhippedCreamDecorator(coffee);

        System.out.println("After adding Whipped Cream:");
        System.out.println(coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());
    }
}