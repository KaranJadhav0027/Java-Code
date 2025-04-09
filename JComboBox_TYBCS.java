//Slip19_1
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class JComboBox_TYBCS extends JFrame implements ItemListener
{
	static JFrame f;
	static JLabel L1,L2;
	static JComboBox C1;
	public static void main(String []args)
	{
		f=new JFrame("TYBSC(Comp. Sci)");
		JComboBox_TYBCS s=new JComboBox_TYBCS();
		f.setLayout(new FlowLayout());
		String s1[]={"Java","Python","Web Technologies","BlockChain Technology","TCS","Data Science"};
		C1=new JComboBox(s1);
		C1.addItemListener(s);
		L1=new JLabel("Select your Subject:");
		L2=new JLabel("Java subject is selected");
		L1.setForeground(Color.red);
		L2.setForeground(Color.blue);
		JPanel p=new JPanel();
		p.add(L1);
		p.add(C1);
		p.add(L2);
		f.add(p);
		f.setSize(600,600);
		f.show();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==C1)
		{
			L2.setText(C1.getSelectedItem()+" subject is selected");
		}
	}
}