package at.hakwt.ui;

import at.hakwt.Race;
import at.hakwt.RacingSnail;
import at.hakwt.SnailRaceMain;

import javax.swing.*;
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

        int i = 1;
        for (RacingSnail participant : race.getParticipants()) {
            JLabel snailLabel = new JLabel("");
            snailLabel.setBounds(xPos, 30 * i, 20, 22);
            snailLabel.setIcon(new ImageIcon(SnailRaceMain.class.getResource("/rennschnecke.png")));
            snails.add(snailLabel);
            i++;
        }

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        for (JLabel snail : snails) {
            panel.add(snail);
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        setSize(1000, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        xPos += 20;
        for (JLabel snail : snails) {
            snail.setBounds(xPos, 11, 20, 22);
        }
        System.out.println("xpos" + xPos);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}
