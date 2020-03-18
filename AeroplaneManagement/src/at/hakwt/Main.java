package at.hakwt;

public class Main {

    public static void main(String[] args) {
	    Aeroplane plane = new Aeroplane("Boing 747-100", 296400, 333400);
	    plane.boarding(350);
        System.out.println("Aktuelles Gewicht: " + plane.currentWeigth() + " kg");
        System.out.println(plane);

        plane.boarding(50);

        System.out.println(plane);
        
    }
}
