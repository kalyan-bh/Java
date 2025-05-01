package designPatterns;
/*
The Decorator Design Pattern is a structural pattern that lets you add new behaviors to objects dynamically without modifying their existing code.
When you want to add responsibilities to objects at runtime.
When extending functionality via inheritance isn’t practical or would cause class explosion.
 */
interface Coffee {
    String getDescription();
    double getCost();
}

class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple Coffee";
    }

    public double getCost() {
        return 5.0;
    }
}

abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription();
    }

    public double getCost() {
        return coffee.getCost();
    }
}

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    public double getCost() {
        return super.getCost() + 1.5;
    }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    public double getCost() {
        return super.getCost() + 0.5;
    }
}

public class Decorator {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);  // add milk
        coffee = new SugarDecorator(coffee); // add sugar

        System.out.println(coffee.getDescription()); // Output: Simple Coffee, Milk, Sugar
        System.out.println("Cost: $" + coffee.getCost()); // Output: Cost: $7.0
    }
    /*
    A coffee order is like a base object (plain coffee) that gets decorated with milk, sugar, cream, etc., without modifying the original coffee class
     */
}
