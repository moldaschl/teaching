package at.hakwt;

public class Main {

    public static void main(String[] args) {
	    /*Car myCar = new Car();
	    myCar.drive(100);
        System.out.println("Der aktuelle Kilometerstand beträgt: " + myCar.getCurrentMileage() + " km!");*/
	    Car myCar = new Car(1650);
        myCar.drive(120, 20);
        System.out.println("Der aktuelle Kilometerstand beträgt: " + myCar.getCurrentMileage() + " km!");
        System.out.println("Der aktuelle Tankinhalt beträgt: " + myCar.getCurrentPetrolQuantity() + " l!");
    }
}
