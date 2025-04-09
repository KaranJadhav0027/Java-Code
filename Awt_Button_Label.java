import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Awt_Button_Label extends Frame
{
	Frame f;
	Label L;
	Button b;
	String s;
	public Awt_Button_Label(String s)
	{
		this.s=s;
		f=new Frame();
		L=new Label("Welcome to param computers!!");
		b=new Button("OK");
		f.setLayout(null);
		L.setBounds(20,30,200,20);
		b.setBounds(60,100,60,40);
		f.add(L);
		f.add(b);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String []args)
	{
		new Awt_Button_Label("Nalini");
	}
}