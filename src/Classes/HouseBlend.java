package Classes;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "Домашний смешанный кофе";
    }

    public double cost() {
        return milkPrice * milk + soyPrice * soy + mochaPrice * mocha + whipPrice * whip + 69.9; // последнее число - цена кофе без дополнений
    }
}
