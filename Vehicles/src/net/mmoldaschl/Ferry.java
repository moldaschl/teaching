package net.mmoldaschl;

import java.util.ArrayList;

/**
 * @author markus.moldaschl
 * @since 23.04.20
 */
public class Ferry {

    private int maxWeight;

    private ArrayList<Vehicle> vehicles;

    public Ferry(int maxWeight) {
        this.maxWeight = maxWeight;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public void board(Vehicle vehicle){

        if ( currentWeight()+vehicle.getMaxWeight() <= this.maxWeight ) {
            this.vehicles.add(vehicle);
        } else {
            System.out.println("Maximales Gewicht überschritten!");
        }
    }

    private int currentWeight() {
        int total = 0;
        for(Vehicle v: this.vehicles) {
            total += v.getMaxWeight();
        }
        return total;
    }



}
