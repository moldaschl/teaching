package at.hakwt;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author markus.moldaschl
 * @since 11.12.19
 * 
 * https://junit.org/junit5/docs/current/user-guide/#writing-tests
 */
public class SocialSecurityNumberCheckTest {

    @Test
    public void checkThatNumberIsCorrect() {
        assertEquals(true, SocialSecurityNumberCheck.socialNoIsReal("4444080580"));
        assertEquals(true, SocialSecurityNumberCheck.socialNoIsRealNoArrayList("4444080580"));
    }

    @Test
    public void checkThatNumberIsNotCorrect() {
        assertEquals(false, SocialSecurityNumberCheck.socialNoIsReal("4445080580"));
        assertEquals(false, SocialSecurityNumberCheck.socialNoIsRealNoArrayList("4445080580"));
    }

    @Test
    public void checkThatNumberTooLongIsNotCorrect() {
        assertEquals(false, SocialSecurityNumberCheck.socialNoIsReal("4445080580123"));
        assertEquals(false, SocialSecurityNumberCheck.socialNoIsRealNoArrayList("4445080580123"));
    }

}
