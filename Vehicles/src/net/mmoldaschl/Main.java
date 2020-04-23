package net.mmoldaschl;

public class Main {

    public static void main(String[] args) {
	    Ferry ferry = new Ferry(40000);

	    Bycicle bycicle1 = new Bycicle("123", 13, 120, "L");

	    Motorbike honda = new Motorbike("h", 200, 400, 300, 140);

	    MotorVehicle truck = new MotorVehicle("t1", 12000, 40000, 100, 400);

		ferry.board(truck);

		ferry.board(bycicle1);
		ferry.board(honda);

    }
}
