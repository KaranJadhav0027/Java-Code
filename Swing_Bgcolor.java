import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Swing_Bgcolor extends JFrame implements ActionListener
{
	JFrame F;
	JButton B;
	Swing_Bgcolor()
	{
		Font font=new Font("Lucida Calligraphy",Font.BOLD,15);
		F=new JFrame("Colorful window");
		Color c=new Color(130,100,150);
		B=new JButton("Click");
		B.setBounds(250,250,100,40);
		B.setFont(font);
		B.setBackground(c);
		F.add(B);
		B.addActionListener(this);
		F.getContentPane().setBackground(Color.blue);
		F.setLayout(null);
		F.setSize(650,600);
		F.setVisible(true);
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==B)
		{
			F.getContentPane().setBackground(Color.RED);
		}
	}
	public static void main(String []args)
	{
		new Swing_Bgcolor();
	}
}