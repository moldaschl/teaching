package at.hakwt;

import at.hakwt.ui.RaceCanvas;

import javax.swing.*;

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
        //race.startRace();
        System.out.println(race.checkWinner());

        JFrame frame = new JFrame();
        RaceCanvas canvas = new RaceCanvas(race);
        frame.add(canvas);
        frame.setSize(1000, 400);
        frame.setVisible(true);

        race.register(canvas);
        race.startRace(canvas);


    }
}

        BettingOffice bettingOffice = new BettingOffice(race);
        bettingOffice.acceptBet("Fritzi", "Markus", 10.0f);
        bettingOffice.startRace();
        System.out.println("Gewinnerschnecke: " + race.checkWinner());
        System.out.println("Wettbüro: " + bettingOffice.toString());

    }
}