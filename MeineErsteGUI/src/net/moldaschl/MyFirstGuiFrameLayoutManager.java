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
public class MyFirstGuiFrameLayoutManager extends JFrame {

    private JPanel contentPane;

    private JTextField newText;

    public MyFirstGuiFrameLayoutManager() {
        setTitle("Meine erste Gui");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //setBounds(100, 150, 329, 169);
        setSize(400, 150);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());

        JPanel center = new JPanel();
        center.setLayout(new FlowLayout());

        JLabel lblNewText = new JLabel("Neuer Fenstertitel:");
        lblNewText.setFont(new Font("Tahoma", Font.PLAIN, 12));
        center.add(lblNewText);

        newText = new JTextField();
        newText.setFont(new Font("Tahoma", Font.PLAIN, 12));
        newText.setPreferredSize(new Dimension(190, 20));
        center.add(newText);
        //center.setBorder(new LineBorder(Color.BLACK));
        contentPane.add(center, BorderLayout.CENTER);


        JPanel east = new JPanel();
        JLabel lblnewPicture = new JLabel("");
        lblnewPicture.setIcon(new ImageIcon(MyFirstGuiFrameLayoutManager.class.getResource("smiley.png")));
        east.add(lblnewPicture);
        contentPane.add(east, BorderLayout.EAST);

        JPanel south = new JPanel();

        JButton btnChange = new JButton("Ändern");
        btnChange.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnChange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeTitle();
            }
        });
        south.add(btnChange);

        JButton btnEnd = new JButton("Beenden");
        btnEnd.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnEnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endProgram();
            }
        });
        south.add(btnEnd);

        contentPane.add(south, BorderLayout.SOUTH);

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
