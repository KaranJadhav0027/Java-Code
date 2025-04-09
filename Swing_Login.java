import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class InvalidPasswordException extends Exception
{
}
class Swing_Login extends JFrame implements ActionListener
{
	JLabel name,pass;
	JTextField nameText;
	JPasswordField PassText;
	JButton login,end;
	static int cnt=0;
	Swing_Login()
	{
		name=new JLabel("Name : ");
		pass=new JLabel("Password : ");
		nameText=new JTextField(20);
		PassText=new JPasswordField(20);
		login=new JButton("Login");
		end=new JButton("End");
		login.addActionListener(this);
		end.addActionListener(this);
		setLayout(new GridLayout(3,2));
		add(name);
		add(nameText);
		add(pass);
		add(PassText);
		add(login);
		add(end);
		setTitle("Login Click");
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==end)
		{
			System.exit(0);
		}
		if(e.getSource()==login)
		{
			try
			{
				String user=nameText.getText();
				String pass=new String(PassText.getPassword());
				if(user.compareTo(pass)==0)
				{
					JOptionPane.showMessageDialog(null,"Login Successful","Login",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				else
				{
					throw new InvalidPasswordException();
				}
			}
			catch(Exception e1)
			{
				cnt++;
				JOptionPane.showMessageDialog(null,"Login Failed","Login",JOptionPane.ERROR_MESSAGE);
				nameText.setText(" ");
				PassText.setText(" ");
				nameText.requestFocus();
				if(cnt==3)
				{
					JOptionPane.showMessageDialog(null,"3 Attempts over ","Login",JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
			}
		}
	}
	public static void main(String []args)
    {
			new Swing_Login();
	}
}