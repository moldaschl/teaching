package net.mmoldaschl;

import javax.swing.*;
import java.awt.*;

/**
 * @author markus.moldaschl
 * @since 13.05.20
 */
public class BorderLayoutMain {

    public static void main(String[] args) {
        JFrame f = new JFrame("BorderLayout");
        JPanel jp = new JPanel();

        jp.setLayout(new BorderLayout());
        jp.add(new JButton("Norden"), BorderLayout.NORTH);
        jp.add(new JButton("Westen"), BorderLayout.WEST);
        jp.add(new JButton("Osten"), BorderLayout.EAST);
        jp.add(new JButton("Süden"), BorderLayout.SOUTH);
        jp.add(new JButton("Center"), BorderLayout.CENTER);
        f.add(jp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }

}
