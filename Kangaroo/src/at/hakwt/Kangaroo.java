package at.hakwt;

import java.util.Random;

/**
 * @author markus.moldaschl
 * @since 13.01.20
 *
 * Ansprechen bei Wiederholung:
 *   - Klassennamen:
 *     - groß schreiben
 *     - Hauptwörter verwenden
 *   - Klassendefinition in geschwungenen Klammern
 *   - Klassenname und Dateiname muss gleich sein --> Umbenennen mit IntelliJ
 *
 *
 */
public class Kangaroo {

    //   - Eigenschaften klein schreiben
    private double clout;
    private double bounce;
    private String name;
    private BoxingGlove leftEye;
    private BoxingGlove rightEye;

    //   - nur einmalige Wertzuweisung ist erlaubt
    private final int BIRTH_CLOUT = 20;
    private final int BIRTH_BOUNCE = 10;

    public Kangaroo(String name) {
        this.name = name;
        this.bounce = BIRTH_BOUNCE;
        this.clout = BIRTH_CLOUT;
        this.leftEye = new BoxingGlove("blue");
        this.rightEye = new BoxingGlove("red");
    }

    public Kangaroo(String name, double clout, double bounce) {
        this.name = name;
        this.clout = clout;
        this.bounce = bounce;
    }

    public void jump() {
        Random rnd = new Random();
        if ( bounce > 6 ) {
            int distance = rnd.nextInt(5) + 1;
            this.bounce -= distance;
            System.out.println("Ich bin " + distance + " m gesprungen!");
        } else {
            System.out.println("Ich habe keine Sprungkraft mehr");
        }
    }

    public void workOut() {
        Random rnd = new Random();
        this.bounce += rnd.nextInt(11);
        this.clout += rnd.nextInt(2);
    }

    public void box() {
        Random rnd = new Random();
        double randomNumber = rnd.nextDouble();
        if ( clout < 2 ) {
            System.out.println("Ich kann nicht mehr boxen. Ich habe keine Schlagkraft mehr");
        } else {
            if ( randomNumber < 0.4 ) {
                this.clout -= 0.5;
                System.out.println("Daneben!");
            } else {
                this.clout -= 1;
                System.out.println("Treffer!");
            }
        }
    }

    // - BoxingGlove-Klasse nicht instanzierbar in Main
    // - Datenkapselung - Für unser Beispiel hier macht ein Boxhandschuh ohne
    //   Känguru keinen Sinn, insofern kapseln wir es in der Känguru Klasse
    //   In einem Onlineshop für Box-Zubehör wäre eine Boxhandschuh eine eigene Klasse
    private class BoxingGlove {
        private String color;

        public BoxingGlove(String color) {
            this.color = color;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getClout() {
        return clout;
    }

    public double getBounce() {
        return bounce;
    }

    public static void bootCamp(Kangaroo kangaroo) {
        for (int i = 0; i < 20; i++) {
            kangaroo.workOut();
        }
    }
}
