//program for GridBagLayout
import java.awt.*;
import javax.swing.*;
public class B_GridBagLayout
{
	public static void main(String []args)
	{
		JFrame f=new JFrame("GridBag Layout Manager");
		JButton b1=new JButton("B1");
		JButton b2=new JButton("B2");
		JButton b3=new JButton("B3");
		JButton b4=new JButton("B4");
		JButton b5=new JButton("B5");
		JPanel panel=new JPanel(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=0;
		c.gridy=0;
		panel.add(b1,c);
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=1;
		c.gridy=0;
		panel.add(b2);
		c.gridx=2;
		c.gridy=0;
		panel.add(b3,c);
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridwidth=3;
		c.gridx=0;
		c.gridy=1;
		panel.add(b4,c);
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=2;
		c.gridwidth=1;
		c.gridy=2;
		panel.add(b5,c);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,200);
		f.getContentPane().add(panel);
		f.setVisible(true);
	}
}