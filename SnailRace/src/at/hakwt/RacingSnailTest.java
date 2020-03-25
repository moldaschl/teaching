package at.hakwt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author markus.moldaschl
 * @since 29.01.20
 */
class RacingSnailTest {

    @Test
    void crawl() {
        int maxSpeed = 100;
        int initialDist = 0;
        RacingSnail seppi = new RacingSnail("seppi", "type", maxSpeed);
        seppi.crawl();
        assertTrue(seppi.getDistanceRaced() > initialDist);
        assertTrue(seppi.getDistanceRaced() <= maxSpeed);
    }
}