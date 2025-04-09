import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class InvalidPasswordException extends Exception
{}
class Swing_Exc_pass extends JFrame implements ActionListener
{
    JLabel nm,ps;
    JTextField nmText;
    JPasswordField psText;
    JButton login,clear;
    static int cnt=0;
    Swing_Exc_pass()
    {
         nm = new JLabel("Name : ");
         ps = new JLabel("Password : ");
         nmText = new JTextField(20);
         psText = new JPasswordField(20);
         login = new JButton("Login");
         clear=new JButton("Clear");
         login.addActionListener(this); 
         clear.addActionListener(this);
                      
         setLayout(new GridLayout(3,2));
          add(nm);
          add(nmText);
          add(ps);
          add(psText);
          add(login);
          add(clear);
         
          setTitle("Login Window");
          setSize(300,300);                              
                                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setVisible(true);
     }
     public void actionPerformed(ActionEvent e)
     {
               if(e.getSource()==clear)
          {
            	   nmText.setText("");
                   psText.setText("");
   
          }
          if(e.getSource()==login)
          {
             try
             {
                 String user = nmText.getText();
                 String pass = new String(psText.getPassword());
                                   if(user.compareTo(pass)==0)
                 {  JOptionPane.showMessageDialog(null,"Login Successful !","Login",JOptionPane.INFORMATION_MESSAGE);
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
                     nmText.setText("");
                     psText.setText("");
                     nmText.requestFocus();
                     if(cnt == 3)
                    {
           JOptionPane.showMessageDialog(null,"3 Attempts Over","Login",JOptionPane.ERROR_MESSAGE);
                        System.exit(0);           
                                                             }
                }       
         }               
   }
  public static void main(String args[])
 {
                new Swing_Exc_pass();
 }
}