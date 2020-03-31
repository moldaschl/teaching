package at.hakwt;

import java.util.Arrays;
import java.util.Random;

/**
 * @author markus.moldaschl
 * @since 29.03.20
 */
public class Airport {

    private String[] gates;

    public Airport() {
        gates = new String[20];
        for (int i = 0; i < 10; i++) {
            gates[i] = "A"+(i+1);
        }
        for (int i = 1; i <= 10; i++) {
            gates[i+9] = "B"+i;
        }

    }

    public BoardingPass checkIn(Passenger passenger, Flight flight) {
        return new BoardingPass(passenger.getName(), flight.getAeroplane().nextSeat(passenger.getName()),
                flight.getGate(), flight.getFlightNumber());
    }

    public String nextGate() {
        return gates[new Random().nextInt(20)];
    }

    @Override
    public String toString() {
        return "Airport{" +
                "gates=" + Arrays.toString(gates) +
                '}';
    }
}
