package Classes;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Кофе тёмной обжарки";
    }

    public double cost() {
        return milkPrice * milk + soyPrice * soy + mochaPrice * mocha + whipPrice * whip + 79.9; // последнее число - цена кофе без дополнений
    }
}
