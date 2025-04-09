//Emp no,name,salary,bonus and net salary
import java.awt.event.*;
import javax.swing.*;
public class Swing_netsal extends JFrame implements ActionListener
{
	static JFrame f;
	static JTextField T1;
	static JTextField T2;
	static JTextField T3;
	static JTextField T4;
	static JLabel L1;
	static JLabel L2;
	static JLabel L3;
	static JLabel L4;
	static JLabel L5;
	static JLabel L6;
	static JLabel L7;
	static JLabel L8;
	static JLabel L9;
	static JLabel L;
	static JButton B;
	Swing_netsal()
	{
	}
	public static void main(String []args)
	{
		f=new JFrame("Employee Details");
		JPanel p=new JPanel();
		f.add(p);
		L1=new JLabel("Enter Employee Number ");
		L1.setBounds(100,150,200,150);
		f.add(L1);
		T1=new JTextField(20);
		T1.setBounds(250,220,100,20);
		f.add(T1);
		L2=new JLabel("Enter Employee Name ");
		L2.setBounds(100,150,240,190);
		f.add(L2);
		T2=new JTextField(20);
		T2.setBounds(250,240,100,20);
		f.add(T2);
		L3=new JLabel("Enter Employee Salary ");
		L3.setBounds(100,150,280,230);
		f.add(L3);
		T3=new JTextField(20);
		T3.setBounds(250,260,100,20);
		f.add(T3);
		L4=new JLabel("Enter Employee Bonus ");
		L4.setBounds(100,150,320,270);
		f.add(L4);
		T4=new JTextField(20);
		T4.setBounds(250,280,100,20);
		f.add(T4);
		L5=new JLabel(" ");
		L6=new JLabel(" ");
		L7=new JLabel(" ");
		L8=new JLabel(" ");
		//L9=new JLabel(" ");
		B=new JButton("SUBMIT");
		B.setBounds(200,320,100,30);
		Swing_netsal N=new Swing_netsal();
        B.addActionListener(N);
        L5.setBounds(100,370,120,40);
		L6.setBounds(100,390,120,40);
		L7.setBounds(100,410,120,40);
		L8.setBounds(100,430,120,40);
        f.add(B);
		f.add(L5);
		f.add(L6);
		f.add(L7);
		f.add(L8);
		f.add(L);
		f.setSize(600,600);
		f.show();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		int sal=Integer.parseInt(T3.getText());
		int bonus=Integer.parseInt(T4.getText());
		int netsal=sal+bonus;
		L9.setText("Net Salary = "+netsal);
		/*L9.setBounds(100,450,120,40);
		String s=e.getActionCommand();
		if(s.equals("SUBMIT"))
		{
			L5.setText(T1.getText());
			L6.setText(T2.getText());
			L7.setText(T3.getText());
			L8.setText(T4.getText());
			T1.setText(" ");
			T2.setText(" ");
			T3.setText(" ");
			T4.setText(" ");
		}*/
	}	
}