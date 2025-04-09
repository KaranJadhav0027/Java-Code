import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Addition extends JFrame implements ActionListener
{
	JLabel L1;
	JTextField T1;
	JLabel L2;
	JTextField T2;
	JButton B;
	JLabel L3;
	public Addition()
	{
		setLayout(new FlowLayout());
		L1=new JLabel("First Number ");
		T1=new JTextField(20);
		L2=new JLabel("Second Number ");
		T2=new JTextField(20);
		B=new JButton("Add");
		L3=new JLabel("Result");
		add(L1);
		add(T1);
		add(L2);
		add(T2);
		add(B);
		add(L3);
		B.addActionListener(this);
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		int a=Integer.parseInt(T1.getText());
		int b=Integer.parseInt(T2.getText());
		int sum=a+b;
		L3.setText("Addition = "+sum);
	}
}
public class Swing_Addition
{
	public static void main(String []args)
	{
		Addition obj=new Addition();
	}
}