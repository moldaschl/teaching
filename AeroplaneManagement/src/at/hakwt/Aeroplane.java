package at.hakwt;

import java.util.Arrays;

/**
 * @author markus.moldaschl
 * @since 06.03.20
 */
public class Aeroplane {

    private String id;

    private int tare;

    private long maxWeight;

    private int passengers;

    private final static int PASSENGERWEIGHT = 100;

    private int seatsPerRow;

    private int rows;

    private String[] seatReservation;

    private int currentSeatPosition;

    public Aeroplane(String id, int tare, long maxWeight, int seatsPerRow, int rows) {
        this.id = id;
        this.tare = tare;
        this.maxWeight = maxWeight;
        this.passengers = 0;
        this.seatsPerRow = seatsPerRow;
        this.rows = rows;
        this.seatReservation = new String[seatsPerRow * rows];
        for (int i = 0; i < seatsPerRow * rows; i++) {
            seatReservation[i] = "";
        }
        this.currentSeatPosition = 0;
    }

    public long currentWeigth() {
        return passengers * PASSENGERWEIGHT + tare;
    }

    public String nextSeat(String passengerName) {
        seatReservation[currentSeatPosition] = passengerName;
        currentSeatPosition++;
        return Integer.toString(currentSeatPosition);
    }


    public void boarding(int noOfPassengers) {
        for (int i = 0; i < noOfPassengers; i++) {
            if ( currentWeigth() + PASSENGERWEIGHT > maxWeight ) {
                System.out.println("No boarding possible anymore");
                return;
            } else {
                passengers++;
            }
        }
    }

    @Override
    public String toString() {
        return "Aeroplane{" +
                "id='" + id + '\'' +
                ", tare=" + tare +
                ", maxWeight=" + maxWeight +
                ", passengers=" + passengers +
                ", seatsPerRow=" + seatsPerRow +
                ", rows=" + rows +
                ", seatReservation=" + Arrays.toString(seatReservation) +
                ", currentSeatPosition=" + currentSeatPosition +
                '}';
    }
}
