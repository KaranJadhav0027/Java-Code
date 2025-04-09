//program for flow layout manager
import java.awt.*;
class demo extends Frame
{
	demo()
	{
		Button[] b=new Button[10];
		setLayout(new FlowLayout());
		for(int i=0;i<b.length;i++)
		{
			b[i]=new Button("Button "+(i+1));
			add(b[i]);
		}
	}
}
public class B_FlowLayout
{
	public static void main(String []args)
	{
		demo obj=new demo();
		obj.setTitle("FlowLayout Example");
		obj.setSize(400,150);
		obj.setVisible(true);
	}
}