//program for card layout Manager
import java.awt.*;
import java.awt.event.*;
class Panel1 extends Panel
{
	Label L1,L2,L3;
	TextField T1,T2,T3;
	Button B1,B2,B3,B4,B5;
	public Panel1()
	{
		L1=new Label("Number 1");
		L2=new Label("Number 2");
		L3=new Label("Result: ");
		T1=new TextField(10);
		T2=new TextField(10);
		T3=new TextField(10);
		T3.setEditable(false);
		B1=new Button("Add");
		B2=new Button("Sub");
		B3=new Button("Multi");
		B4=new Button("Div");
		B5=new Button("Exit");
		add(L1);
		add(T1);
		add(L2);
		add(T2);
		add(L3);
		add(T3);
		add(B1);
		add(B2);
		add(B3);
		add(B4);
		add(B5);
	}
}
class Panel2 extends Panel
{
	Checkbox ch1,ch2,ch3,ch4;
	public Panel2()
	{
		ch1=new Checkbox("Windows 8");
		ch2=new Checkbox("Linux Ubuntu");
		ch3=new Checkbox("Android");
		ch4=new Checkbox("MacOS");
		setLayout(new GridLayout(2,2));
		add(ch1);
		add(ch2);
		add(ch3);
	    add(ch4);
	}
}
class Panel3 extends Panel
{
	TextArea T;
	TextField T1,T2;
	Label L1,L2;
	Button B1,B2,B3,B4;
	public Panel3()
	{
		T=new TextArea(10,50);
		T1=new TextField(10);
		T2=new TextField(10);
		L1=new Label("Find What ? : ");
		L2=new Label("Replace With : ");
		B1=new Button("Find");
		B2=new Button("Replace");
		B3=new Button("Replace All");
		B4=new Button("Cancel");
		add(T);
		add(L1);
		add(T1);
		add(L2);
		add(T2);
		add(B1);
		add(B2);
		add(B3);
		add(B4);
	}
}
class B_CardLayout extends Frame implements ActionListener
{
	Button B1,B2;
	Panel cards;
	CardLayout C;
	Panel1 P1;
	Panel2 P2;
	Panel3 P3;
	public B_CardLayout(String title)
	{
		super(title);
		B1=new Button("Next");
		B2=new Button("Previous");
		cards=new Panel();
		P1=new Panel1();
		P2=new Panel2();
		P3=new Panel3();
		C=new CardLayout();
		cards.setLayout(C);
		cards.add(P1,"Panel1");
		cards.add(P2,"Panel2");
		cards.add(P3,"Panel3");
		B1.addActionListener(this);
		B2.addActionListener(this);
        Panel P=new Panel();
        P.add(B1);
        P.add(B2);
        add("North",P);
        add("Center",cards);
        setSize(300,300);
        setVisible(true);  		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==B1)
			C.next(cards);
		else
			C.previous(cards);
	}
	public static void main(String []args)
	{
		new B_CardLayout("Card Layout Demo");
	}
}