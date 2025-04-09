import java.awt.*;
public class Awt_Label extends Frame
{
	Frame f;
	Label l;
	String s;
	public Awt_Label(String s)
	{
		this.s=s;
		f=new Frame(s);
		l=new Label("Param Computers");
		f.add(l);
		f.setTitle("Nalini");
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String []args)
	{
		new Awt_Label("Param");
	}
}