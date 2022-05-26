package Classes;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Кофе без кофеина";
    }

    public double cost() {
        return milkPrice * milk + soyPrice * soy + mochaPrice * mocha + whipPrice * whip + 49.9; // последнее число - цена кофе без дополнений
    }
}
