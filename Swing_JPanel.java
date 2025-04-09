import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Swing_JPanel extends Frame
{
	static JFrame f;
	static JButton b,b1,b2;
	static JLabel L;
	public static void main(String []args)
	{
		f=new JFrame("Panel");
		L=new JLabel("Panel Label");
		b=new JButton("OK");
		b1=new JButton("SAVE");
		b2=new JButton("CANCEL");
		JPanel p=new JPanel();
		p.add(b);
		p.add(b1);
		p.add(b2);
		p.add(L);
		p.setBackground(Color.pink);
		f.add(p);
		f.setSize(300,300);
		f.show();
	}
}