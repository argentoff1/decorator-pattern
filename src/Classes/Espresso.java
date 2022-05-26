package Classes;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Кофе эспрессо";
    }

    public double cost() {
        return milkPrice * milk + soyPrice * soy + mochaPrice * mocha + whipPrice * whip + 54.9; // последнее число - цена кофе без дополнений
    }
}
