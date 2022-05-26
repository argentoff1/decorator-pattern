package Decorators;

import Coffees.Beverage;

public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " молоко,";
    }

    public double cost() {
        return 2.99 + beverage.cost();
    }
}
