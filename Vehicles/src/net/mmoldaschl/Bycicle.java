package net.mmoldaschl;

/**
 * @author markus.moldaschl
 * @since 23.04.20
 */
public class Bycicle extends Vehicle {

    private String frameSize;

    public Bycicle(String vehicleNumber, int tare, int maxWeight, String frameSize) {
        super(vehicleNumber, tare, maxWeight);
        this.frameSize = frameSize;
    }

}
