package at.hakwt;

import at.hakwt.ui.RaceCanvas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author markus.moldaschl
 * @since 29.01.20
 */
class RaceTest {

    @Test
    void letCrawl() {
        int maxSpeed = 100;
        int initialDist = 0;
        RacingSnail seppi = new RacingSnail("seppi", "type", maxSpeed);
        RacingSnail karli = new RacingSnail("karli", "type", maxSpeed);
        Race race = new Race("Lauf 1", 100);
        race.addRacingSnail(seppi);
        race.addRacingSnail(karli);

        race.letCrawl();
        assertTrue(seppi.getDistanceRaced() > initialDist);
        assertTrue(karli.getDistanceRaced() > initialDist);
    }

    @Test
    void startRace() {
        int maxSpeed = 10;
        int dist = 100;
        RacingSnail seppi = new RacingSnail("seppi", "type", maxSpeed);
        RacingSnail karli = new RacingSnail("karli", "type", maxSpeed);
        Race race = new Race("Lauf 1", dist);
        race.addRacingSnail(seppi);
        race.addRacingSnail(karli);
        race.startRace(new RaceCanvas(race));

        RacingSnail winner = race.checkWinner();
        assertNotNull(winner);
        assertTrue(winner.getDistanceRaced() >= dist);
    }

}