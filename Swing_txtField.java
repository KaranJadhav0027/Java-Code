import java.awt.event.*;
import javax.swing.*;
class Swing_txtField extends JFrame implements ActionListener
{
	static JTextField txt1;
	static JTextField txt2;
	static JTextField txt3;
	static JFrame f;
	static JButton b;
	static JLabel L1;
	static JLabel L2;
	static JLabel L3;
	static JLabel L4;
	static JLabel L5;
	static JLabel L6;
	Swing_txtField()
	{
	}
	public static void main(String []args)
	{
		f=new JFrame("Text Field");
		JPanel p=new JPanel();
		f.add(p);
		L1=new JLabel("Enter Roll Number ");
		p.add(L1);
		txt1=new JTextField(16);
		p.add(txt1);
		L2=new JLabel("Enter Name ");
		p.add(L2);
		txt2=new JTextField(16);
		p.add(txt2);
		L3=new JLabel("Enter Address ");
		p.add(L3);
		txt3=new JTextField(16);
		p.add(txt3);
		L4=new JLabel(" ");
		L5=new JLabel(" ");
		L6=new JLabel(" ");
		b=new JButton("SUBMIT");
		Swing_txtField txt=new Swing_txtField();
		b.addActionListener(txt);
		p.add(b);
		p.add(L4);
		p.add(L5);
		p.add(L6);
		f.setSize(400,400);
		f.show();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.addWindowListener(listener);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(s.equals("SUBMIT"))
		{
			L4.setText(txt1.getText());
			L5.setText(txt2.getText());
			L6.setText(txt3.getText());
			txt1.setText(" ");
			txt2.setText(" ");
			txt3.setText(" ");
		}
	}
}