//program for scroll bar
import java.awt.*;
import javax.swing.*;
public class B_ScrollBar
{
	Frame f;
	Panel p;
	Label L1,L2;
	B_ScrollBar()
	{
		f=new Frame("Scroll Bar");
		p=new Panel();
		L1=new Label("Displaying horizontal and vertical scroll bar",Label.CENTER);
		Scrollbar s1=new Scrollbar(Scrollbar.HORIZONTAL,10,40,0,100);
		Scrollbar s2=new Scrollbar(Scrollbar.VERTICAL,10,60,0,100);
		f.add(L1,BorderLayout.NORTH);
		f.add(s2,BorderLayout.EAST);
		f.add(s1,BorderLayout.SOUTH);
		f.setSize(370,270);
		f.setVisible(true);
	}
	public static void main(String []args)
	{
		new B_ScrollBar();
	}
}