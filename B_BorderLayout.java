//program for BorderLayout
import java.awt.*;
public class B_BorderLayout extends Frame
{
	TextField name,pass;
	Button E,W,S,N,C;
	BorderLayout b1;
	B_BorderLayout(String s)
	{
		super(s);
		setVisible(true);
		setSize(500,300);
		b1=new BorderLayout();
		setLayout(b1);
		E=new Button("East");
		W=new Button("West");
		S=new Button("South");
		N=new Button("North");
		C=new Button("Center");
		add(E,BorderLayout.EAST);
		add(W,BorderLayout.WEST);
		add(S,BorderLayout.SOUTH);
		add(N,BorderLayout.NORTH);
		add(C,BorderLayout.CENTER);
	}
	public static void main(String []args)
	{
		B_BorderLayout obj=new B_BorderLayout("Demonstrating Frame");
	}
}