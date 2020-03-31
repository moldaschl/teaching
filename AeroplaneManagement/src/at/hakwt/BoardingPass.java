package at.hakwt;

/**
 * @author markus.moldaschl
 * @since 29.03.20
 */
public class BoardingPass {

    private String passengerName;
    private String seat;
    private String gate;
    private String flight;

    public BoardingPass(String passengerName, String seat, String gate, String flight) {
        this.passengerName = passengerName;
        this.seat = seat;
        this.gate = gate;
        this.flight = flight;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getSeat() {
        return seat;
    }

    public String getGate() {
        return gate;
    }

    public String getFlight() {
        return flight;
    }

    @Override
    public String toString() {
        return "BoardingPass{" +
                "passengerName='" + passengerName + '\'' +
                ", seat='" + seat + '\'' +
                ", gate='" + gate + '\'' +
                ", flight='" + flight + '\'' +
                '}';
    }
}
