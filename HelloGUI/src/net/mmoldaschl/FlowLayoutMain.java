package net.mmoldaschl;

import javax.swing.*;

/**
 * @author markus.moldaschl
 * @since 13.05.20
 */
public class FlowLayoutMain {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("FlowLayout test");
        JPanel panel = new JPanel(); // FlowLayoutManager ist standardmäßig eingestellt
        for (char c = 0; c <= 5; c++) {
            panel.add(new JButton("Button " + (char) ('A' + c)));
        }
        jFrame.add(panel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

}
