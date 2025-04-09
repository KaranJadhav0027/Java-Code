//program for Grid Layout Manager
import java.awt.*;
import javax.swing.*;
public class B_GridLayout
{
	JFrame frame;
	B_GridLayout()
	{
		JFrame frame=new JFrame();
		JButton b1=new JButton("One");
		JButton b2=new JButton("Two");
		JButton b3=new JButton("Three");
		JButton b4=new JButton("Four");
		JButton b5=new JButton("Five");
		JButton b6=new JButton("Six");
		JButton b7=new JButton("Seven");
		JButton b8=new JButton("Eight");
		JButton b9=new JButton("Nine");
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.setLayout(new GridLayout(5,5));
		frame.setVisible(true);
	}
	public static void main(String []args)
	{
		new B_GridLayout();
	}
}