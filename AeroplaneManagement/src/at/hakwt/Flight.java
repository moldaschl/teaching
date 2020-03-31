package at.hakwt;

/**
 * @author markus.moldaschl
 * @since 29.03.20
 */
public class Flight {

    private String flightNumber;

    private Aeroplane aeroplane;

    private String gate;

    public Flight(String flightNumber, Aeroplane aeroplane, String gate) {
        this.flightNumber = flightNumber;
        this.aeroplane = aeroplane;
        this.gate = gate;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Aeroplane getAeroplane() {
        return aeroplane;
    }

    public String getGate() {
        return gate;
    }
}
