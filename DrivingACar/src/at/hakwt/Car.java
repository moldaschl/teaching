package at.hakwt;

/**
 * @author markus.moldaschl
 * @since 13.01.20
 */
public class Car {

    private double currentMileage;
    private double currentPetrolQuantity;
    private double fuelCapacity;
    private double fuelConsumption;
    private double consumptionOnTemperature;

    public Car(double mileage) {
        this.currentMileage = mileage;
        this.currentPetrolQuantity = 70;
        this.fuelConsumption = 7.3d;
        this.consumptionOnTemperature = 20;
    }

    public Car(double mileage, double fuelCapacity, double fuelConsumption) {
        this.currentMileage = mileage;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
        this.currentPetrolQuantity = fuelCapacity;
        this.consumptionOnTemperature = 20;
    }

    public Car(double mileage, double fuelCapacity, double fuelConsumption, double temp) {
        this(mileage, fuelCapacity, fuelConsumption);
        this.consumptionOnTemperature = temp;
    }

    public Car() {
        this.currentMileage = 100;
        this.consumptionOnTemperature = 20;
    }

    public void drive(double km, double temp) {
        this.currentMileage += km;
        double consumption = this.fuelConsumption;
        if ( temp < this.consumptionOnTemperature ) {
            consumption = (this.consumptionOnTemperature - temp) * 0.02 + fuelConsumption;
        }
        this.currentPetrolQuantity -= consumption * km / 100;
    }

    public double getCurrentMileage() {
        return currentMileage;
    }

    public double getCurrentPetrolQuantity() {
        return currentPetrolQuantity;
    }
    
}
