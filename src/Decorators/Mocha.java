package Decorators;

import Coffees.Beverage;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " шоколад,";
    }

    public double cost() {
        return 4.99 + beverage.cost();
    }
}
