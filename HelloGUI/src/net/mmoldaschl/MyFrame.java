package net.mmoldaschl;

import javax.swing.*;
import java.awt.*;

/**
 * @author markus.moldaschl
 * @since 07.05.20
 */
public class MyFrame extends JFrame {

    public MyFrame(String title) {
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

        JPanel panel = new JPanel();
        panel.add(new JButton("my first button"));
        panel.add(new JTextField("Editier mich. Ich bin ein JTexfield", 20));
        add(panel);
        panel.setLayout(new FlowLayout());
        pack();
    }

}
