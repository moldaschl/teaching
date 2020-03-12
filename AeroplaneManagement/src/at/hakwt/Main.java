package at.hakwt;

public class Main {

    public static void main(String[] args) {
	    Aeroplane plane = new Aeroplane("Boing 747-100", 296400, 333400);
        for (int i = 0; i < 350; i++) {
            plane.boarding();
        }
        System.out.println("Aktuelles Gewicht: " + plane.currentWeigth() + " kg");
        System.out.println(plane);
        for (int i = 0; i < 50; i++) {
            plane.boarding();
        }
        System.out.println(plane);
        
    }
}
