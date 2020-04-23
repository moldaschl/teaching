package net.mmoldaschl;

/**
 * @author markus.moldaschl
 * @since 23.04.20
 */
public class MotorVehicle extends Vehicle {

    private int maxSpeed;

    private int horsePower;

    public MotorVehicle(String vehicleNumber, int tare, int maxWeight,
                        int maxSpeed, int horsePower) {
        super(vehicleNumber, tare, maxWeight);
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }


    
}
