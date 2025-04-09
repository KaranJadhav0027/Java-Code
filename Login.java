import java.awt.*;
import java.awt.event;
class InvalidPasswordException extends Exception
{
	InvalidPasswordException()
	{
		System.out.println("user name and password is not same");
	}
}
public class Login extends Frame implements ActionListener
{
	Label L1,L2;
	TextField T1;
	TextField T2,T3;
	Button B1,B2;
	Panel p;
	int atmpt=0;
	char c=".";
	public void log()
	{
		p=new Panel();
		L1=new Label("User Name :",Label.CENTER);
		L2=new Label("Password :",Label.RIGHT);
		T1=new TextField(20);
		T2=new TextField(20);
		T2.setEchoChar(c);
		T3=new TextField(20);
		T3.setEditable(false);
		B1=new Button("Login");
		B2=new Button("Clear");
		B1.addActionListener(this);
		B2.addActionListener(this);
		p.add(L1);
		p.add(T1);
		p.add(L2);
		p.add(T2);
		p.add(B1);
		p.add(B2);
		p.add(T3);
		add(p);
		setTitle("Login");
		setSize(300,300);
		setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button B1=Button(e.getSource());
		{
			if(atmpt<3)
			{
				if((B2.getLabel())=="Clear")
				{
					T1.setText(" ");
					T2.setText(" ");
				}
				if((B1.getLabel()).equals("Login"))
				{
					try
					{
						String user=T1.getText();
						String L2=T2.getText();
						if(user.compareTo(L1)==0)
						{
							T3.setText("valid");
							System.out.println("Username is valid");
						}
						else
						{
							throw(new InvalidPasswordException());
						}
					}
					catch(Exception e)
					{
						T3.setText("Error");
					}
					atmpt++;
				}
			}
			else
			{
				System.out.println("you are using 3 attempts");
				System.exit(0);
			}
		}
	}
	public static void main(String []args)
		{
			Login ovj=new Login();
			obj.log();
		}
}