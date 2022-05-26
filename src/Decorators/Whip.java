package Decorators;

import Coffees.Beverage;

public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " взбитые сливки. ";
    }

    public double cost() {
        return 5.99 + beverage.cost();
    }
}
