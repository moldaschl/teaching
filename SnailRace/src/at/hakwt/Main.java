package at.hakwt;

public class Main {

    public static void main(String[] args) {
        RacingSnail fritzi = new RacingSnail("Fritzi", "someType", 10);
        RacingSnail karli = new RacingSnail("Karli", "someType", 5);
        fritzi.crawl();
        System.out.println(fritzi.toString());

        Race race = new Race("1. Lauf", 800);
        race.addRacingSnail(fritzi);
        race.addRacingSnail(karli);
        //race.letCrawl();
        System.out.println(race.toString());
        race.startRace();
        System.out.println(race.checkWinner());

    }
}