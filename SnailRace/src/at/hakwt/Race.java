package at.hakwt;

import java.util.ArrayList;

/**
 * @author markus.moldaschl
 * @since 25.02.20
 */
public class Race {

    private String name;
    private ArrayList<RacingSnail> participants;
    private int distance;

    public Race(String name, int distance) {
        this.name = name;
        this.participants = new ArrayList<>();
        this.distance = distance;
    }

    public void addRacingSnail(RacingSnail snail) {
        this.participants.add(snail);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Race{");
        sb.append("name='").append(name).append('\'');
        sb.append(", participants=").append(participants);
        sb.append('}');
        return sb.toString();
    }

    public void letCrawl() {
        int i = 0;
        for(RacingSnail snail : participants) {
            snail.crawl();
            i++;
        }

    }

    public RacingSnail checkWinner() {
        RacingSnail winner = null;
        for(RacingSnail snail : participants) {
            if( snail.getDistanceRaced() >= distance ) {
                if ( winner == null ) {
                    winner = snail;
                } else {
                    if ( snail.getDistanceRaced() > winner.getDistanceRaced() ) {
                        winner = snail;
                    }
                }

            }
        }
        return winner;
    }

    public void startRace() {
        do {
            letCrawl();
        } while (checkWinner() == null );
    }

}