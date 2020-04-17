package at.hakwt;

public class Main {

    public static void main(String[] args) {
	    for (Weekday d : Weekday.values()) {
            System.out.println(d + " isWeekend(): " + d.isWeekend() + ", dayInWeek: " + d.getDayInWeek());
        }
    }
}
