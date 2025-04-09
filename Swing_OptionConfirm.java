import javax.swing.JOptionPane;
public class Swing_OptionConfirm
{
	public static void main(String []args)
	{
		int input=JOptionPane.showConfirmDialog(null,"Are you sure ?");
		System.out.println(input);
	}
}