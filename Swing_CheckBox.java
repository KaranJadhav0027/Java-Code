import javax.swing.*;
public class Swing_CheckBox
{
	Swing_CheckBox()
	{
		JFrame f=new JFrame("Check Box");
		JCheckBox checkbox1=new JCheckBox("C++");
		checkbox1.setBounds(100,100,50,50);
		JCheckBox checkbox2=new JCheckBox("Java",true);
		checkbox2.setBounds(100,150,100,50);
		f.add(checkbox1);
		f.add(checkbox2);
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String []args)
	{
		new Swing_CheckBox();
	}
}