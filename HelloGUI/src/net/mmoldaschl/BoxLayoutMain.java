package net.mmoldaschl;

import javax.swing.*;

/**
 * @author markus.moldaschl
 * @since 13.05.20
 */
public class BoxLayoutMain {

    public static void main(String[] args) {
        JFrame f = new JFrame("BoxLayout");
        JPanel jp = new JPanel();

        // Erzeuge ein horizontales und ein vertikales BoxLayout
        //BoxLayout layout = new BoxLayout(jp, BoxLayout.X_AXIS);
        BoxLayout layout = new BoxLayout(jp, BoxLayout.Y_AXIS);
        jp.setLayout(layout);
        for (char c = 0; c < 4; ++c) {

            jp.add(new JButton("Button " + (char) ('A' + c)));
        }
        JTextArea jta = new JTextArea(2, 10);
        jta.append("JTextArea \nsecond row");
        jp.add(jta);
        f.add(jp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
}
