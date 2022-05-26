import Classes.DarkRoast;
import Classes.Decaf;
import Classes.Espresso;
import Classes.HouseBlend;

public class Main {

    public static void main(String[] args) {
        HouseBlend houseBlend = new HouseBlend();
        DarkRoast darkRoast = new DarkRoast();
        Decaf decaf = new Decaf();
        Espresso espresso = new Espresso();

        houseBlend.setMilk();
        houseBlend.setSoy();
        houseBlend.setMocha();
        houseBlend.setWhip();

        darkRoast.setSoy();
        darkRoast.setMocha();
        darkRoast.setWhip();

        decaf.setMilk();
        decaf.setMocha();

        espresso.setWhip();

        System.out.println(houseBlend.getDescription());
        System.out.println(darkRoast.getDescription());
        System.out.println(decaf.getDescription());
        System.out.println(espresso.getDescription());
    }
}
