package Decorators;

import Coffees.Beverage;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " соя,";
    }

    public double cost() {
        return 3.99 + beverage.cost();
    }
}
