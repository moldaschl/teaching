package at.hakwt;

public class Main {

    public static void main(String[] args) {
	    Automat isoStar = new Automat("Iso-Kraft-Star");
        for (int i = 0; i < 11; i++) {
            isoStar.removal();
        }
        isoStar.setDrinkStock(5);
        isoStar.removal();
        System.out.println(isoStar);
    }
}
