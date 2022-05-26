package Classes;

public class Beverage {
    public String description;

    public int milk = 0;
    public int soy = 0;
    public int mocha = 0;
    public int whip = 0;

    public double milkPrice = 2.99;
    public double soyPrice = 3.99;
    public double mochaPrice = 4.99;
    public double whipPrice = 5.99;

    public String getDescription() {
        return description + hasMilk() + hasSoy() + hasMocha() + hasWhip() + cost();
    }

    public double cost() {
        return milkPrice * milk + soyPrice * soy + mochaPrice * mocha + whipPrice * whip;
    }

    private String hasMilk() {
        if(milk > 0) {
            return " + " + milk + " молоко";
        }
        return " без молока";
    }
    public void setMilk() {
        milk++;
    }

    private String hasSoy() {
        if(soy > 0) {
            return " + " + soy + " соя";
        }
        return " без сои";
    }
    public void setSoy() {
        soy++;
    }

    private String hasMocha() {
        if(mocha > 0) {
            return " + " + mocha + " моккачино";
        }
        return " без моккачино";
    }
    public void setMocha() {
        mocha++;
    }

    private String hasWhip() {
        if(whip > 0) {
            return " + " + whip + " взбитые сливки ";
        }
        return " без взбитых сливок ";
    }
    public void setWhip() {
        whip++;
    }
}
