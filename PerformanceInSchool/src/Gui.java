import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
    private JPanel contentPane;
    private JTextField txtSchoolwork;
    private JTextField txtTest;
    private JTextField txtCooperation;
    private JTextField txtAverage;
    private JTextField txtGrade;
    private Grade g;

    public Gui() {
        setTitle("Noten");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(200, 200, 400, 300);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblSchoolwork = new JLabel("Schularbeit:");
        lblSchoolwork.setFont(new Font("Arial", Font.PLAIN, 14));
        lblSchoolwork.setBounds(20, 20, 154, 16);
        contentPane.add(lblSchoolwork);

        JLabel lblTest = new JLabel("Test:");
        lblTest.setFont(new Font("Arial", Font.PLAIN, 14));
        lblTest.setBounds(20, 50, 154, 16);
        contentPane.add(lblTest);

        JLabel lblCooperation = new JLabel("Mitarbeit:");
        lblCooperation.setFont(new Font("Arial", Font.PLAIN, 14));
        lblCooperation.setBounds(20, 80, 154, 16);
        contentPane.add(lblCooperation);

        txtSchoolwork = new JTextField();
        txtSchoolwork.setFont(new Font("Arial", Font.PLAIN, 12));
        txtSchoolwork.setBounds(150, 20, 40, 16);
        txtSchoolwork.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(txtSchoolwork);

        txtTest = new JTextField();
        txtTest.setFont(new Font("Arial", Font.PLAIN, 12));
        txtTest.setBounds(150, 50, 40, 16);
        txtTest.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(txtTest);

        txtCooperation = new JTextField();
        txtCooperation.setFont(new Font("Arial", Font.PLAIN, 12));
        txtCooperation.setBounds(150, 80, 40, 16);
        txtCooperation.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(txtCooperation);

        JButton btnNew = new JButton("Neu");
        btnNew.setFont(new Font("Arial", Font.PLAIN, 12));
        btnNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newCalculate();
            }
        });
        btnNew.setBounds(240, 18, 100, 20);
        contentPane.add(btnNew);

        JButton btnCalculate = new JButton("Berechnen");
        btnCalculate.setFont(new Font("Arial", Font.PLAIN, 12));
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
        btnCalculate.setBounds(240, 48, 100, 20);
        contentPane.add(btnCalculate);

        JButton btnEnd = new JButton("Beenden");
        btnEnd.setFont(new Font("Arial", Font.PLAIN, 12));
        btnEnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endProgram();
            }
        });
        btnEnd.setBounds(240, 78, 100, 20);
        contentPane.add(btnEnd);

        JLabel lblCertificate = new JLabel("");
        lblCertificate.setBounds(20, 120, 86, 110);
        lblCertificate.setIcon(new ImageIcon(Gui.class.getResource("/img/Zeugnis.gif")));
        contentPane.add(lblCertificate);

        JLabel lblAverage = new JLabel("Notendurchschnitt:");
        lblAverage.setFont(new Font("Arial", Font.PLAIN, 14));
        lblAverage.setBounds(140, 140, 150, 16);
        contentPane.add(lblAverage);

        JLabel lblGrade = new JLabel("Zeugnisnote:");
        lblGrade.setFont(new Font("Arial", Font.PLAIN, 14));
        lblGrade.setBounds(140, 190, 150, 16);
        contentPane.add(lblGrade);

        txtAverage = new JTextField();
        txtAverage.setFont(new Font("Arial", Font.PLAIN, 12));
        txtAverage.setBounds(300, 140, 40, 16);
        txtAverage.setHorizontalAlignment(SwingConstants.CENTER);
        txtAverage.setEditable(false);
        contentPane.add(txtAverage);

        txtGrade = new JTextField();
        txtGrade.setFont(new Font("Arial", Font.PLAIN, 12));
        txtGrade.setBounds(230, 190, 100, 16);
        txtGrade.setHorizontalAlignment(SwingConstants.CENTER);
        txtGrade.setEditable(false);
        contentPane.add(txtGrade);
        pack();

    }

    private void calculate() {
        Grade g = new Grade(Integer.parseInt(this.txtSchoolwork.getText()), Integer.parseInt(this.txtTest.getText()), Integer.parseInt(this.txtCooperation.getText()));
        txtAverage.setText(Double.toString(g.getAverage()));
        txtGrade.setText(g.getGrade());
    }

    private void newCalculate() {
        txtAverage.setText("");
        txtCooperation.setText("");
        txtGrade.setText("");
        txtSchoolwork.setText("");
        txtTest.setText("");
        txtSchoolwork.requestFocus();
    }


    private void endProgram() {
        dispose();
        System.exit(0);
    }


}
