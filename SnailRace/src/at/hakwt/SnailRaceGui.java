package at.hakwt;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * @author markus.moldaschl
 * @since 05.06.20
 */
public class SnailRaceGui extends JFrame {

    private final ArrayList<RacingSnail> snails;

    private final ArrayList<JLabel> snailLabels;

    private final JPanel inputPanel;

    private final JPanel racePanel;

    private final JPanel contentPane;

    private final Race race;

    private Timer timer;

    public SnailRaceGui() {
        snails = new ArrayList<>();
        snailLabels = new ArrayList<>();

        setTitle("Snail Race GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);

        this.contentPane = new JPanel();
        this.contentPane.setLayout(new BorderLayout());
        this.contentPane.setBorder(new LineBorder(Color.CYAN));

        inputPanel = new JPanel();
        inputPanel.setPreferredSize(new Dimension(400, 200));
        inputPanel.setBorder(new LineBorder(Color.BLACK));

        initInputPanel();

        contentPane.add(inputPanel, BorderLayout.NORTH);

        racePanel = new JPanel();
        racePanel.setPreferredSize(new Dimension(400, 200));
        racePanel.setBorder(new LineBorder(Color.BLACK));
        //racePanel.setLayout(new GridLayout(3, 1));
        racePanel.setLayout(null);
        contentPane.add(racePanel, BorderLayout.CENTER);

        race = new Race("Race1", 200);

        setContentPane(contentPane);
        setVisible(true);
    }

    private void initInputPanel() {
        inputPanel.setLayout(null);
        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(15, 20, 80, 25);
        inputPanel.add(nameLabel);
        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(95, 20, 100, 25);
        inputPanel.add(nameTextField);

        JLabel maxSpeedLabel = new JLabel("Max. speed: ");
        maxSpeedLabel.setBounds(15, 50, 80, 25);
        inputPanel.add(maxSpeedLabel);

        JTextField maxSpeedTextField = new JTextField();
        maxSpeedTextField.setBounds(115, 50, 80, 25);
        inputPanel.add(maxSpeedTextField);

        JButton saveButton = new JButton("save");
        saveButton.setBounds(15, 80, 80, 25);
        inputPanel.add(saveButton);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                snails.add(new RacingSnail(nameTextField.getText(), "", Integer.valueOf(maxSpeedTextField.getText())));
                System.out.println(snails.toString());
                ImageIcon snailIcon = new ImageIcon(SnailRaceGui.class.getResource("snail.jpeg"));
                JLabel snailLabel = new JLabel();
                snailLabel.setIcon(snailIcon);
                snailLabel.setBounds(20, snails.size() * 45, 70, 42);
                snailLabel.setBorder(new LineBorder(Color.BLACK));
                racePanel.add(snailLabel);
                snailLabels.add(snailLabel);

                nameTextField.setText("");
                maxSpeedTextField.setText("");
                if (snails.size() == 3) {
                    saveButton.setEnabled(false);
                }
                racePanel.repaint();
            }
        });

        JButton clearButton = new JButton("clear");
        clearButton.setBounds(115, 80, 80, 25);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameTextField.setText("");
                maxSpeedTextField.setText("");
            }
        });
        inputPanel.add(clearButton);

        JButton startButton = new JButton("start");
        startButton.setBounds(200, 80, 80, 25);

        timer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (race.checkWinner() == null) {
                    race.letCrawl();
                    int i = 0;
                    for (RacingSnail snail : snails) {
                        JLabel raceSnailLabel = snailLabels.get(i);
                        int x = snail.getDistanceRaced() + 20;
                        int y = raceSnailLabel.getY();
                        int w = raceSnailLabel.getWidth();
                        int h = raceSnailLabel.getHeight();
                        raceSnailLabel.setBounds(x, y, w, h);
                        i++;
                    }
                    racePanel.repaint();
                }
                racePanel.repaint();
            }
        });

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (RacingSnail snail : snails) {
                    race.addRacingSnail(snail);
                }
                timer.start();
            }
        });
        inputPanel.add(startButton);

    }

}
