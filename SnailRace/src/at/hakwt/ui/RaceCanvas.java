package at.hakwt.ui;

import at.hakwt.Race;
import at.hakwt.RacingSnail;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author markus.moldaschl
 * @since 25.02.20
 */
public class RaceCanvas extends Canvas implements ActionListener {

    private Race race;

    public RaceCanvas(Race race) {
        this.race = race;
    }

    @Override
    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();

        int yPos = 10;
        for(RacingSnail participant : race.getParticipants() ) {
            Image i = t.getImage("rennschnecke.png");
            g.drawImage(i, participant.getDistanceRaced()+10, yPos, this);
            yPos += 50;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
