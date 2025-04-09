import java.awt.*;
import java.awt.event.*;
public class Awt_St_Ch
{
	Awt_St_Ch()
	{
		Frame f=new Frame("Using two CheckBox !!");
		final Label L=new Label();
		L.setAlignment(Label.CENTER);
		L.setSize(400,100);
		Checkbox ch1=new Checkbox("PHP");
		ch1.setBounds(100,100,50,50);
		Checkbox ch2=new Checkbox("JAVA",true);
		ch2.setBounds(100,150,50,50);
		f.add(ch1);
		f.add(ch2);
		f.add(L);
		ch1.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				L.setText("PHP:"+(e.getStateChange()==1?"PHP checkbox is on ": "Unchecked"));
			}
		});
		ch2.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				L.setText("JAVA:"+(e.getStateChange()==1?"JAVA checkbox is on ": "Unchecked"));
			}
		});
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String []args)
	{
		new Awt_St_Ch();
	}
}