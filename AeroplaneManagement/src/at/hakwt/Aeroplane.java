package at.hakwt;

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

    public Aeroplane(String id, int tare, long maxWeight) {
        this.id = id;
        this.tare = tare;
        this.maxWeight = maxWeight;
        this.passengers = 0;
    }

    public long currentWeigth() {
        return passengers * PASSENGERWEIGHT + tare;
    }

    public void boarding() {
        if ( currentWeigth() + PASSENGERWEIGHT > maxWeight ) {
            System.out.println("No boarding possible anymore");
        } else {
            passengers++;
        }
    }

    @Override
    public String toString() {
        return "Aeroplane{" +
                "id='" + id + '\'' +
                ", tare=" + tare +
                ", maxWeight=" + maxWeight +
                ", passengers=" + passengers +
                '}';
    }
}
