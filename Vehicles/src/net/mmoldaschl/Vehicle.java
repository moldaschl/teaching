package net.mmoldaschl;

/**
 * @author markus.moldaschl
 * @since 23.04.20
 */
public abstract class Vehicle {

    protected int vehicleNumber;

    private int tare;

    private int maxWeight;

    public Vehicle(int vehicleNumber, int tare, int maxWeight) {
        this.vehicleNumber = vehicleNumber;
        this.tare = tare;
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public abstract String getVehicleNumber();

}
