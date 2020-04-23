package net.mmoldaschl;

/**
 * @author markus.moldaschl
 * @since 23.04.20
 */
public class Vehicle {

    private String vehicleNumber;

    private int tare;

    private int maxWeight;

    public Vehicle(String vehicleNumber, int tare, int maxWeight) {
        this.vehicleNumber = vehicleNumber;
        this.tare = tare;
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
