package at.hakwt;

import java.util.ArrayList;

/**
 * @author markus.moldaschl
 * @since 26.03.20
 */
public class BettingOffice {

    private Race race;

    private ArrayList<Bet> acceptedBets;

    private static final int BET_FACTOR = 2;

    public BettingOffice(Race race) {
        this.race = race;
        this.acceptedBets = new ArrayList<>();
    }

    public void acceptBet(String snailName, String gamblerName, float bet) {
        this.acceptedBets.add(new Bet(snailName, gamblerName, bet));
    }

    public void startRace() {
        this.race.startRace();
    }

    @Override
    public String toString() {
        return "BettingOffice{" +
                "race=" + race +
                ", acceptedBets=" + acceptedBets +
                '}';
    }
}
