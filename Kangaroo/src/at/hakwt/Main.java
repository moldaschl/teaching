package at.hakwt;

public class Main {

    public static void main(String[] args) {
        Kangaroo sweetSusi = new Kangaroo("sweetSusi");

        Kangaroo weakJohn = new Kangaroo("john", 3, 5);

        Kangaroo strongTomm = new Kangaroo("tom", 40, 40);

        for (int i = 0; i < 3; i++) {
            sweetSusi.workOut();
        }

        for (int i = 0; i < 12; i++) {
            sweetSusi.jump();
        }

        for (int i = 0; i < 30; i++) {
            sweetSusi.box();
        }
    }
}
