package at.hakwt;

/**
 * @author markus.moldaschl
 * @since 26.03.20
 */
public class Bet {

    private String snailName;

    private String gamblerName;

    private float bet;

    public Bet(String snailName, String gamblerName, float bet) {
        this.snailName = snailName;
        this.gamblerName = gamblerName;
        this.bet = bet;
    }

    public String getSnailName() {
        return snailName;
    }

    public String getGamblerName() {
        return gamblerName;
    }

    public float getBet() {
        return bet;
    }

    @Override
    public String toString() {
        return "Bet{" +
                "snailName='" + snailName + '\'' +
                ", gamblerName='" + gamblerName + '\'' +
                ", bet=" + bet +
                '}';
    }
}
