package net.mmoldaschl.gradesgui;

import javax.swing.*;
import java.awt.*;

/**
 * @author markus.moldaschl
 * @since 15.05.20
 */
public class GradesGuiMain {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Noten");
        frame.setLayout(new FlowLayout());
        JPanel upperPanel = new JPanel();

        upperPanel.setLayout(new GridLayout(3, 3));
        upperPanel.add(new JLabel("x"));
        upperPanel.add(new JTextField("x", 10));
        upperPanel.add(new JButton("x"));
        upperPanel.add(new JLabel("y"));
        upperPanel.add(new JTextField("y", 10));
        upperPanel.add(new JButton("y"));
        upperPanel.add(new JLabel("z"));
        upperPanel.add(new JTextField("z", 10));
        upperPanel.add(new JButton("z"));
        frame.add(upperPanel);

        JPanel lowerPanel = new JPanel();
        lowerPanel.setLayout(new GridLayout(1, 2));
        JPanel lowerLeft = new JPanel();
        lowerLeft.add(new JLabel("image label"));
        JPanel lowerRight = new JPanel();
        lowerRight.setLayout(new GridLayout(2, 2));
        lowerRight.add(new JLabel("a"));
        lowerRight.add(new JLabel("a"));
        lowerRight.add(new JLabel("b"));
        lowerRight.add(new JLabel("b"));

        lowerPanel.add(lowerLeft);
        lowerPanel.add(lowerRight);

        frame.add(lowerPanel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400, 400);

    }

}
