import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Swing_JLabel extends JFrame
{
	Container c;
	JLabel L;
	public Swing_JLabel(String Title)
	{
		super(Title);
		c=this.getContentPane();
		L=new JLabel("Good Morning",JLabel.CENTER);
		c.add(L);
		setSize(350,200);
		show();
	}
	public static void main(String []args)
	{
		Swing_JLabel f=new Swing_JLabel("Param Computers");
		WindowListener listener=new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		};
	}
}