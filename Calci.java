//GUI designing and event handling
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calci extends JFrame implements ActionListener
{
	String msg=" ";
	int v1,v2,result;
	JTextField t;
	JButton b[]=new JButton[10];
	JButton add,sub,mul,div,clear,equals;
	char choice;
	JPanel p,p1;

	Calci()
	{
		setLayout(new BorderLayout());
		p =new JPanel();
		t=new JTextField(20);
		p.add(t);
		
		p1=new JPanel();
		p1.setLayout(new GridLayout(5,4));
		for(int i=0;i<10;i++)
		{
			b[i]=new JButton(""+i);
		}
		equals=new JButton("=");
		add=new JButton("+");
		sub=new JButton("-");
		mul=new JButton("*");
		div=new JButton("/");
		clear=new JButton("C");
		
		for(int i=0;i<10;i++)
		{
			p1.add(b[i]);
		}
               
		p1.add(equals);
		p1.add(add);
		p1.add(sub);
		p1.add(mul);
		p1.add(div);
		p1.add(clear);
		
		for(int i=0;i<10;i++)
		{
			b[i].addActionListener(this);
		}
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		clear.addActionListener(this);
		equals.addActionListener(this);
		
		add(p,BorderLayout.NORTH);
		add(p1);
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	}
               
public void actionPerformed(ActionEvent ae)
{
	String str = ae.getActionCommand();
	char ch = str.charAt(0);
		
	if ( Character.isDigit(ch))
		t.setText(t.getText()+str);
	else
		if(str.equals("+"))
		{
			v1=Integer.parseInt(t.getText());
			choice='+';
			t.setText("");
		}
		else if(str.equals("-"))
		{
			v1=Integer.parseInt(t.getText());
			choice='-';
			t.setText("");
		}
		else if(str.equals("*"))
		{	
			v1=Integer.parseInt(t.getText());
			choice='*';
			t.setText("");
		}
		else if(str.equals("/"))
		{
			v1=Integer.parseInt(t.getText());
			choice='/';
			t.setText("");
		}
		
		if(str.equals("="))
		{
			v2=Integer.parseInt(t.getText());
			if(choice=='+')
				result=v1+v2;
			else if(choice=='-')
				result=v1-v2;
			else if(choice=='*')
				result=v1*v2;
			else if(choice=='/')
				result=v1/v2;
		
			t.setText(""+result);
		}
		
		if(str.equals("C"))
		{
			t.setText("");
		}
	}
	public static void main(String a[])
	{
		Calci ob = new Calci();
	}	
}