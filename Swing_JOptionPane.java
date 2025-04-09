import javax.swing.JOptionPane;
public class Swing_JOptionPane
{
	public static void main(String []args)
	{
		String F_num=JOptionPane.showInputDialog("Enter first number ");
		String S_num=JOptionPane.showInputDialog("Enter Second number ");
		int a=Integer.parseInt(F_num);
		int b=Integer.parseInt(S_num);
		int sum=a+b;
		JOptionPane.showMessageDialog(null,"The sum is "+sum,"Sum of two integers ",JOptionPane.PLAIN_MESSAGE);
	}
}