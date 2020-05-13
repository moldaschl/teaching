package net.mmoldaschl;

/**
 * @author markus.moldaschl
 * @since 23.04.20
 */
public class Motorbike extends MotorVehicle {

    public Motorbike(int vehicleNumber, int tare, int maxWeight, int maxSpeed, int horsePower) {
        super(vehicleNumber, tare, maxWeight, maxSpeed, horsePower);
    }

    public String getVehicleNumber() {
        return "MB" + vehicleNumber;
    }

}
