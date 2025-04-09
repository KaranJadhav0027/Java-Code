//program for choice control
import java.awt.*;
import javax.swing.*;
class B_ChoiceControl
{
	static Choice c;
	static JFrame f;
	B_ChoiceControl()
	{
	}
	public static void main(String []args)
	{
		JFrame f=new JFrame("My Choice");
		JPanel p=new JPanel();
		c=new Choice();
		c.add("Java");
		c.add("TCS");
		c.add("BCT");
		c.add("Python");
		p.add(c);
		f.add(p);
		f.show();
		f.setSize(300,100);
	}
}