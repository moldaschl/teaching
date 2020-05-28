package net.moldaschl;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author markus.moldaschl
 * @since 28.05.20
 */
public class MyFirstGuiFrame extends JFrame {

    private JPanel contentPane;

    private JTextField newText;

    public MyFirstGuiFrame() {
        setTitle("Meine erste Gui");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 150, 329, 169);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        newText = new JTextField();
        newText.setFont(new Font("Tahoma", Font.PLAIN, 12));
        newText.setBounds(20, 46, 190, 20);
        contentPane.add(newText);

        JLabel lblNewText = new JLabel("Neuer Fenstertitel:");
        lblNewText.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewText.setBounds(10, 18, 154, 14);
        contentPane.add(lblNewText);

        JLabel lblnewPicture = new JLabel("");
        lblnewPicture.setBounds(230, 11, 72, 64);
        lblnewPicture.setIcon(new ImageIcon(MyFirstGuiFrame.class.getResource("smiley.png")));
        contentPane.add(lblnewPicture);

        JButton btnChange = new JButton("Ändern");
        btnChange.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnChange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeTitle();
            }
        });
        btnChange.setBounds(20, 82, 89, 25);
        contentPane.add(btnChange);

        JButton btnEnd = new JButton("Beenden");
        btnEnd.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnEnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endProgram();
            }
        });
        btnEnd.setBounds(181, 82, 89, 25);
        contentPane.add(btnEnd);

        setVisible(true);
    }

    private void changeTitle() {
        setTitle(newText.getText());
    }

    private void endProgram() {
        dispose();
        System.exit(0);
    }


}
