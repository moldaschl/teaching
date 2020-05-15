package at.hakwt.ui;

import at.hakwt.Race;
import at.hakwt.RacingSnail;
import at.hakwt.SnailRaceMain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * @author markus.moldaschl
 * @since 25.02.20
 */
public class RaceFrame extends JFrame implements ActionListener {

    private Race race;
    private List<JLabel> snails;
    private int xPos = 20;

    public RaceFrame(Race race) {
        this.race = race;
        snails = new ArrayList<>();

        for (RacingSnail participant : race.getParticipants()) {
            JLabel snailLabel = new JLabel("");
            snailLabel.setIcon(new ImageIcon(SnailRaceMain.class.getResource("/rennschnecke.png")));
            snails.add(snailLabel);
        }

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(race.getParticipants().size(), 1));
        for (JLabel snail : snails) {
            panel.add(snail);
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        setSize(1000, race.getParticipants().size() * 50);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int i = 0;
        for (JLabel snail : snails) {
            snail.setBounds(race.getParticipants().get(i).getDistanceRaced() + xPos, snail.getY(), snail.getWidth(), snail.getHeight());
            i++;
        }
        waitABit();
    }

    private void waitABit() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}
