//program for list
import java.awt.*;
class B_List extends Frame
{
	List L;
	B_List(String s)
	{
		super(s);
		setVisible(true);
		setSize(500,300);
		L=new List(4);
		setLayout(new FlowLayout());
		L.add("Java");
		L.add("TCS");
		L.add("BCT");
		L.add("Python");
		L.add("PHP");
		L.add("OS");
		L.add("Networking");
		add(L);
	}
	public static void main(String []args)
	{
		B_List f=new B_List("List");
	}
}