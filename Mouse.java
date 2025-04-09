//all clear program & successfully run 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class mouseFrame extends JFrame
{
	TextField T1,T2;
	Label L1,L2;
	int x,y;
	Panel p;
	mouseFrame(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		p=new Panel();
		p.setLayout(new GridLayout(2,2,5,5));
		T1=new TextField(20);
		L1=new Label("Co-ordinated of clicking ");
		L2=new Label("Co-ordinates of movement ");
		T2=new TextField(20);
		p.add(L1);
		p.add(T1);
		p.add(L2);
		p.add(T2);
		add(p);
		addMouseListener(new mouseClick());
		addMouseMotionListener(new mouseMove());
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class mouseClick extends MouseAdapter
	{
		public void mouseClicked(MouseEvent e)
		{
			x=e.getX();
			y=e.getY();
			T1.setText("X="+x+"Y="+y);
		}
	}
	class mouseMove extends MouseMotionAdapter
	{
		public void mouseMoved(MouseEvent e)
		{
			x=e.getX();
			y=e.getY();
			T2.setText("X="+x+"Y="+y);
		}
	}
}
public class Mouse
{
	public static void main(String []args)
	{
		mouseFrame M=new mouseFrame("Mouse Movement");
	}
} 