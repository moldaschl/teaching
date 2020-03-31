package at.hakwt;

public class Main {

    public static void main(String[] args) {
	    Aeroplane plane = new Aeroplane("Wasserflieger", 296400, 333400, 2, 5);

	    Airport innsbruck = new Airport();
        System.out.println(innsbruck.toString());
	    String gate = innsbruck.nextGate();
        for (int i = 0; i < 10; i++) {
            BoardingPass pass = innsbruck.checkIn(new Passenger("Rudolf Mayer" + i), new Flight("VIE102", plane, gate));
            System.out.println(pass);
        }
        System.out.println(plane);
        
	    plane.boarding(350);
        System.out.println("Aktuelles Gewicht: " + plane.currentWeigth() + " kg");
        System.out.println(plane);

        plane.boarding(50);

        System.out.println(plane);
        
    }
}
