package at.hakwt;

/**
 * @author markus.moldaschl
 * @since 24.03.20
 */
public enum Weekday {

    Monday(1), Tuesday(2), Wednesday(3), Thursday(4), Friday(5), Saturday(6), Sunday(7);

    private int dayInWeek;

    Weekday(int dayInWeek) {
        this.dayInWeek = dayInWeek;
    }

    public boolean isWeekend() {
        if ( this.name().equals("Saturday") || this.name().equals("Sunday") ) {
            return true;
        }
        return false;
    }

    public int getDayInWeek() {
        return dayInWeek;
    }
}
