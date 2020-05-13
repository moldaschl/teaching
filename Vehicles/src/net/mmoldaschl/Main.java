package net.mmoldaschl;

public class Main {

    public static void main(String[] args) {
		Ferry ferry = new Ferry(40000);

		Bycicle bycicle1 = new Bycicle(123, 13, 120, "L");

		Motorbike honda = new Motorbike(444, 200, 400, 300, 140);

//	    MotorVehicle truck = new MotorVehicle(111, 12000, 40000, 100, 400);

//	    Vehicle v = new Vehicle(123, 10, 100);

//	    ferry.board(v);

//		ferry.board(truck);

		ferry.board(bycicle1);
		ferry.board(honda);

		System.out.println(bycicle1.getVehicleNumber());
		System.out.println(honda.getVehicleNumber());

	}
}
