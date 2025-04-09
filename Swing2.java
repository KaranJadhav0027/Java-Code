import java.awt.event.*;
import javax.swing.*;

public class Swing2 extends JFrame implements ActionListener {
    static JTextField txt1;
    static JTextField txt2;
    static JTextField txt3;
    static JTextField txt4;
    static JFrame f;
    static JButton b;
    static JLabel lab1;
    static JLabel lab2;
    static JLabel lab3;
    static JLabel lab4;
    static JLabel lab5;
    static JLabel lab6;
    static JLabel lab7;
    static JLabel lab8;
    static JCheckBox male, female;
    static JCheckBox chkReading, chkSports, chkMusic;
    static ButtonGroup genderGroup, interestGroup;

    Swing2() {
    }

    public static void main(String[] args) {
        f = new JFrame("Text Fields Example");
        JPanel p = new JPanel();
        f.add(p);
        p.setLayout(null); // Set layout to null for absolute positioning

        lab1 = new JLabel("Enter Number");
        lab1.setBounds(20, 20, 100, 20); // Set bounds for label 1
        p.add(lab1);
        txt1 = new JTextField(16);
        txt1.setBounds(130, 20, 150, 20); // Set bounds for text field 1
        p.add(txt1);

        lab2 = new JLabel("Enter Name");
        lab2.setBounds(20, 50, 100, 20); // Set bounds for label 2
        p.add(lab2);
        txt2 = new JTextField(16);
        txt2.setBounds(130, 50, 150, 20); // Set bounds for text field 2
        p.add(txt2);

        lab3 = new JLabel("Enter Salary");
        lab3.setBounds(20, 80, 100, 20); // Set bounds for label 3
        p.add(lab3);
        txt3 = new JTextField(16);
        txt3.setBounds(130, 80, 150, 20); // Set bounds for text field 3
        p.add(txt3);

        lab4 = new JLabel("Enter Bonus");
        lab4.setBounds(20, 110, 100, 20); // Set bounds for label 4
        p.add(lab4);
        txt4 = new JTextField(16);
        txt4.setBounds(130, 110, 150, 20); // Set bounds for text field 4
        p.add(txt4);

        // Gender checkboxes
        male = new JCheckBox("Male");
        male.setBounds(130, 140, 60, 20);
        p.add(male);

        female = new JCheckBox("Female");
        female.setBounds(200, 140, 80, 20);
        p.add(female);

        // Interests checkboxes
        chkReading = new JCheckBox("Reading");
        chkReading.setBounds(130, 170, 80, 20);
        p.add(chkReading);

        chkSports = new JCheckBox("Sports");
        chkSports.setBounds(220, 170, 80, 20);
        p.add(chkSports);

        chkMusic = new JCheckBox("Music");
        chkMusic.setBounds(310, 170, 80, 20);
        p.add(chkMusic);

        b = new JButton("Submit");
        b.setBounds(100, 200, 80, 30); // Set bounds for button
        Swing txt = new Swing();
        b.addActionListener(txt);
        p.add(b);

        lab5 = new JLabel(" ");
        lab5.setBounds(20, 240, 400, 20); // Set bounds for label 5
        p.add(lab5);
        lab6 = new JLabel(" ");
        lab6.setBounds(20, 270, 400, 20); // Set bounds for label 6
        p.add(lab6);

        f.setSize(450, 350); // Adjusted size to fit components properly
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            // Insert data into the labels
            lab5.setText("Number: " + txt1.getText());
            lab6.setText("Name: " + txt2.getText());
            lab7.setText("Salary: " + txt3.getText());
            lab8.setText("Bonus: " + txt4.getText());

            // Handle gender selection
            String gender = "";
            if (male.isSelected()) {
                gender = "Male";
            } else if (female.isSelected()) {
                gender = "Female";
            }
            lab8.setText(lab8.getText() + ", Gender: " + gender);

            // Handle interests selection
            StringBuilder interests = new StringBuilder();
            if (chkReading.isSelected()) {
                interests.append("Reading ");
            }
            if (chkSports.isSelected()) {
                interests.append("Sports ");
            }
            if (chkMusic.isSelected()) {
                interests.append("Music");
            }
            lab8.setText(lab8.getText() + ", Interests: " + interests.toString());

            // Clear text fields
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");

            // Clear checkboxes
            male.setSelected(false);
            female.setSelected(false);
            chkReading.setSelected(false);
            chkSports.setSelected(false);
            chkMusic.setSelected(false);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
