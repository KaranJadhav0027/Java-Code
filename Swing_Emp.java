//Emp_no,name,sal,and bonus using setBounds

import java.awt.event.*;
import javax.swing.*;
class Swing_Emp extends JFrame implements ActionListener
{
	static JTextField t1;
	static JTextField t2;
	static JTextField t3;
	static JTextField t4;
	static JFrame f;
	static JButton b;
	static JLabel L1;
	static JLabel L2;
	static JLabel L3;
	static JLabel L4;
	static JLabel L5;
	static JLabel L6;
	static JLabel L7;
	static JLabel L8;
	static JLabel L;
	Swing_Emp()
	{
	}
	public static void main(String []args)
	{
		f=new JFrame("Employee Field");
		JPanel p=new JPanel();
		f.add(p);
		L1=new JLabel("Enter Employee Number ");
		L1.setBounds(100,150,200,150);
		f.add(L1);
		t1=new JTextField(16);
		t1.setBounds(250,220,100,20);
		f.add(t1);
		L2=new JLabel("Enter Employee Name ");
		L2.setBounds(100,150,240,190);
		f.add(L2);
		t2=new JTextField(16);
		t2.setBounds(250,240,100,20);
		f.add(t2);
		L3=new JLabel("Enter Employee Salary ");
		L3.setBounds(100,150,280,230);
		f.add(L3);
		t3=new JTextField(16);
		t3.setBounds(250,260,100,20);
		f.add(t3);
		L4=new JLabel("Enter Employee Bonus ");
		L4.setBounds(100,150,320,270);
		f.add(L4);
		t4=new JTextField(16);
		t4.setBounds(250,280,100,20);
		f.add(t4);
		L5=new JLabel(" ");
		L6=new JLabel(" ");
		L7=new JLabel(" ");
		L8=new JLabel(" ");
		L=new JLabel(" ");
		b=new JButton("SUBMIT");
		b.setBounds(200,320,100,30);
		L7.setBounds(240,210,180,70);
		Swing_Emp E=new Swing_Emp();
		b.addActionListener(E);
		L5.setBounds(100,370,120,40);
		L6.setBounds(100,390,120,40);
		L7.setBounds(100,410,120,40);
		L8.setBounds(100,430,120,40);
		f.add(b);
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
		String s=e.getActionCommand();
		if(s.equals("SUBMIT"))
		{
			L5.setText(t1.getText());
			L6.setText(t2.getText());
			L7.setText(t3.getText());
			L8.setText(t4.getText());
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
			t4.setText(" ");
		}
	}
}