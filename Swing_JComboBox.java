import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Swing_JComboBox extends JFrame implements ItemListener
{
	static JFrame f;
	static JLabel l,l1;
	static JComboBox C1;
	public static void main(String []args)
	{
		f=new JFrame("Frame");
		Swing_JComboBox s=new Swing_JComboBox();
		f.setLayout(new FlowLayout());
		String s1[]={"Mumbai","Pune","Nashik","Malegaon","Jaipur","New Delhi"};
		C1=new JComboBox(s1);
		C1.addItemListener(s);
		l=new JLabel("Select your city");
		l1=new JLabel("Jaipur selected");
		l.setForeground(Color.red);
		l1.setForeground(Color.blue);
		JPanel p=new JPanel();
		p.add(l);
		p.add(C1);
		p.add(l1);
		f.add(p);
		f.setSize(400,300);
		f.show();
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==C1)
		{
			l1.setText(C1.getSelectedItem()+" selected");
		}
	}
}