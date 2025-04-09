import java.awt.*;
import java.awt.event.*;
class Mouse_Click_Move extends Frame 
{
	TextField T1,T2;
	Label L1,L2;
	int X,Y;
	Panel p;
	Mouse_Click_Move(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		p=new Panel();
		p.setLayout(new GridLayout(2,2,5,5));
		T1=new TextField(20);
		L1=new Label("Co-ordinates of clicking");
		L2=new Label("Co-ordinates of movement");
		T2=new TextField(20);
		p.add(L1);
		p.add(T1);
		p.add(L2);
		p.add(T2);
		add(p);
		addMouseListener(new M_Click());
		addMouseMotionListener(new M_Move());
		setSize(500,500);
		setVisible(true);
	}
}
class M_Click extends MouseAdapter
{
	public void MouseClicked(MouseEvent me)
	{
		X=me.getX();
		Y=me.getY();
		T1.setText("x="+X+" y="+Y);
	}
}
class M_Move extends MouseMotionAdapter
{
	public void MouseMoved(MouseEvent me)
	{
		X=me.getX();
		Y=me.getY();
		T1.setText("x="+X+" y="+Y);
	}
}
class Mouse_Click
{
	public static void main(String []args)
	{
		Mouse_Click_Move f=new Mouse_Click_Move("Mouse click & Move");
	}
}