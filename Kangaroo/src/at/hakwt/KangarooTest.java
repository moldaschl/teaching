package at.hakwt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author markus.moldaschl
 * @since 13.01.20
 */
class KangarooTest {

    @Test
    void jump() {
        Kangaroo k = new Kangaroo("k");
        double bounce = k.getBounce();
        k.jump();
        assertTrue(bounce > k.getBounce());
    }

    @Test
    void workOut() {
        Kangaroo k = new Kangaroo("k");
        double bounce = k.getBounce();
        double clout = k.getClout();
        k.workOut();
        assertTrue(k.getBounce() >= bounce);
        assertTrue(k.getClout() >= clout);
    }

    @Test
    void box() {
        Kangaroo k = new Kangaroo("k");
        double clout = k.getClout();
        k.box();
        assertTrue(clout > k.getBounce());
    }
}