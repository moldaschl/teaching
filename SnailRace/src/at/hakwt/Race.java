package at.hakwt;

import at.hakwt.ui.RaceCanvas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author markus.moldaschl
 * @since 25.02.20
 */
public class Race {

    private String name;
    private List<RacingSnail> participants;
    private int distance;
    private List<ActionListener> actionListeners;

    public Race(String name, int distance) {
        this.name = name;
        this.participants = new ArrayList<>();
        this.distance = distance;
        this.actionListeners = new ArrayList<>();
    }

    public void register(ActionListener actionListener) {
        this.actionListeners.add(actionListener);
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
        for(RacingSnail snail : participants) {
            snail.crawl();
        }
        notifyListeners();
        // participants.forEach(RacingSnail::crawl);
    }

    private void notifyListeners() {
        for(ActionListener actionListener : actionListeners) {
            actionListener.actionPerformed(new ActionEvent(this, 1, "some command"));
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

    public void startRace(RaceCanvas canvas) {
        do {
            letCrawl();
        } while (checkWinner() == null );
    }

    public List<RacingSnail> getParticipants() {
        return Collections.unmodifiableList(participants);
    }
}
