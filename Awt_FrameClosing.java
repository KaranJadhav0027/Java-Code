import java.awt.*;
import java.awt.event.*;
public class Awt_FrameClosing extends WindowAdapter
{
	Frame f;
	Awt_FrameClosing()
	{
		f=new Frame();
		f.addWindowListener(this);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}
	public static void main(String []args)
	{
		new Awt_FrameClosing();
	}
}