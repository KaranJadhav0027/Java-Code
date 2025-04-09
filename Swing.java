import java.awt.event.*;
import javax.swing.*;

class Swing extends JFrame implements ActionListener {
    static JTextField txtNumber;
    static JTextField txtName;
    static JTextField txtSalary;
    static JTextField txtBonus;
    static JFrame f;
    static JButton b;
    static JLabel labNumber;
    static JLabel labName;
    static JLabel labSalary;
    static JLabel labBonus;
    static JLabel PrintNumber;
    static JLabel PrintName;
    static JLabel PrintSalary;
    static JLabel PrintBonus;
	static JCheckBox male,female;
	
	Swing() 
	{
		
    }
     public static void main(String[] args) {
        f = new JFrame("Text Fields Example");
        JPanel p = new JPanel();
        f.add(p);
        p.setLayout(null); // Set layout to null for absolute positioning

        labNumber = new JLabel("Enter Number");
        labNumber.setBounds(20, 20, 100, 20); // Set bounds for label 1
        p.add(labNumber);
        txtNumber = new JTextField(16);
        txtNumber.setBounds(130, 20, 150, 20); // Set bounds for text field 1
        p.add(txtNumber);

        labName = new JLabel("Enter Name");
        labName.setBounds(20, 50, 100, 20); // Set bounds for label 2
        p.add(labName);
        txtName = new JTextField(16);
        txtName.setBounds(130, 50, 150, 20); // Set bounds for text field 2
        p.add(txtName);

        labSalary = new JLabel("Enter Salary");
        labSalary.setBounds(20, 80, 100, 20); // Set bounds for label 3
        p.add(labSalary);
        txtSalary = new JTextField(16);
        txtSalary.setBounds(130, 80, 150, 20); // Set bounds for text field 3
        p.add(txtSalary);

        labBonus = new JLabel("Enter Bonus");
        labBonus.setBounds(20, 110, 100, 20); // Set bounds for label 4
        p.add(labBonus);
        txtBonus = new JTextField(16);
        txtBonus.setBounds(130, 110, 150, 20); // Set bounds for text field 4
        p.add(txtBonus);

        b = new JButton("Submit");
        b.setBounds(100, 140, 80, 30); // Set bounds for button
        Swing txt = new Swing();
        b.addActionListener(txt);
        p.add(b);

        PrintNumber = new JLabel(" ");
        PrintNumber.setBounds(20, 180, 200, 20); // Set bounds for label 5
        p.add(PrintNumber);
        PrintName = new JLabel(" ");
        PrintName.setBounds(20, 210, 200, 20); // Set bounds for label 6
        p.add(PrintName);
        PrintSalary = new JLabel(" ");
        PrintSalary.setBounds(20, 240, 200, 20); // Set bounds for label 7
        p.add(PrintSalary);
        PrintBonus = new JLabel(" ");
        PrintBonus.setBounds(20, 270, 200, 20); // Set bounds for label 8
        p.add(PrintBonus);

        f.setSize(600, 500); // Adjusted size to fit components properly
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        PrintNumber.setText(txtNumber.getText());
        PrintName.setText(txtName.getText());
        PrintSalary.setText(txtSalary.getText());
        PrintBonus.setText(txtBonus.getText());
        txtNumber.setText("");
        txtName.setText("");
        txtSalary.setText("");
        txtBonus.setText("");
    }
}
/*import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class Swing extends JFrame implements ActionListener {
    static JTextField txtNumber;
    static JTextField txtName;
    static JTextField txtSalary;
    static JTextField txtBonus;
    static JFrame f;
    static JButton b;
    static JLabel labNumber;
    static JLabel labName;
    static JLabel labSalary;
    static JLabel labBonus;
    static JLabel PrintNumber;
    static JLabel PrintName;
    static JLabel PrintSalary;
    static JLabel PrintBonus;
    
    // SQLite connection variables
    static Connection conn;
    static PreparedStatement pstmt;

    Swing() {
        try {
            // Initialize SQLite connection
            conn = DriverManager.getConnection("jdbc:sqlite:data.db");
            createTable(); // Create table if not exists
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Method to create table if not exists
    private void createTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS data_table (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                     "number TEXT, name TEXT, salary REAL, bonus REAL)";
        pstmt = conn.prepareStatement(sql);
        pstmt.executeUpdate();
    }

    public static void main(String[] args) {
        f = new JFrame("Text Fields Example");
        JPanel p = new JPanel();
        f.add(p);
        p.setLayout(null); // Set layout to null for absolute positioning

        labNumber = new JLabel("Enter Number");
        labNumber.setBounds(20, 20, 100, 20); // Set bounds for label 1
        p.add(labNumber);
        txtNumber = new JTextField(16);
        txtNumber.setBounds(130, 20, 150, 20); // Set bounds for text field 1
        p.add(txtNumber);

        labName = new JLabel("Enter Name");
        labName.setBounds(20, 50, 100, 20); // Set bounds for label 2
        p.add(labName);
        txtName = new JTextField(16);
        txtName.setBounds(130, 50, 150, 20); // Set bounds for text field 2
        p.add(txtName);

        labSalary = new JLabel("Enter Salary");
        labSalary.setBounds(20, 80, 100, 20); // Set bounds for label 3
        p.add(labSalary);
        txtSalary = new JTextField(16);
        txtSalary.setBounds(130, 80, 150, 20); // Set bounds for text field 3
        p.add(txtSalary);

        labBonus = new JLabel("Enter Bonus");
        labBonus.setBounds(20, 110, 100, 20); // Set bounds for label 4
        p.add(labBonus);
        txtBonus = new JTextField(16);
        txtBonus.setBounds(130, 110, 150, 20); // Set bounds for text field 4
        p.add(txtBonus);

        b = new JButton("Submit");
        b.setBounds(100, 140, 80, 30); // Set bounds for button
        Swing txt = new Swing();
        b.addActionListener(txt);
        p.add(b);

        PrintNumber = new JLabel(" ");
        PrintNumber.setBounds(20, 180, 200, 20); // Set bounds for label 5
        p.add(PrintNumber);
        PrintName = new JLabel(" ");
        PrintName.setBounds(20, 210, 200, 20); // Set bounds for label 6
        p.add(PrintName);
        PrintSalary = new JLabel(" ");
        PrintSalary.setBounds(20, 240, 200, 20); // Set bounds for label 7
        p.add(PrintSalary);
        PrintBonus = new JLabel(" ");
        PrintBonus.setBounds(20, 270, 200, 20); // Set bounds for label 8
        p.add(PrintBonus);

        f.setSize(300, 350); // Adjusted size to fit components properly
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            // Insert data into the database
            String sql = "INSERT INTO data_table (number, name, salary, bonus) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, txtNumber.getText());
            pstmt.setString(2, txtName.getText());
            pstmt.setDouble(3, Double.parseDouble(txtSalary.getText()));
            pstmt.setDouble(4, Double.parseDouble(txtBonus.getText()));
            pstmt.executeUpdate();
            
            // Display inserted data in labels
            PrintNumber.setText("Number: " + txtNumber.getText());
            PrintName.setText("Name: " + txtName.getText());
            PrintSalary.setText("Salary: " + txtSalary.getText());
            PrintBonus.setText("Bonus: " + txtBonus.getText());

            // Clear text fields
            txtNumber.setText("");
            txtName.setText("");
            txtSalary.setText("");
            txtBonus.setText("");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
*/
