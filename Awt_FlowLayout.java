import java.awt.*;
public class Awt_FlowLayout extends Frame
{
	Label L1,L2;
	public Awt_FlowLayout()
	{
		setTitle("Label Demo");
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setLocationRelativeTo(null);
		L1=new Label("Good Morning");
		L2=new Label("TYBCS");
		add(L1);
		add(L2);
	}
	public static void main(String []args)
	{
		new Awt_FlowLayout();
	}
}