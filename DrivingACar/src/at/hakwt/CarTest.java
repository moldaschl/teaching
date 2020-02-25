package at.hakwt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author markus.moldaschl
 * @since 13.01.20
 */
class CarTest {

    @Test
    void drive() {
        Car myCar = new Car();
        double milage = myCar.getCurrentMileage();
        double distanceToDrive = 100;
        myCar.drive(distanceToDrive, 20);
        assertEquals(milage+distanceToDrive, myCar.getCurrentMileage());
    }

    @Test
    void testFuelConsumption() {
        Car myCar = new Car(1650);
        myCar.drive(120, 20);
        assertEquals(61.24, myCar.getCurrentPetrolQuantity());
    }

    @Test
    void testFuelDynamicConsumption() {
        Car myCar = new Car(1000, 100, 10);
        myCar.drive(100, 20);
        assertEquals(90, myCar.getCurrentPetrolQuantity());
    }

    @Test
    void testTemperatureAwareConsumption() {
        Car myCar = new Car(1000, 100, 10);
        myCar.drive(100, 10);
        assertEquals(89.8, myCar.getCurrentPetrolQuantity());
    }
}