import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class buttonBackChange extends JFrame implements ActionListener 
{
    JFrame frame;
    JButton pink;

    buttonBackChange() 
	{
        Font font = new Font("Lucida Calligraphy", Font.BOLD, 9);
        frame = new JFrame("Colorful window");
        Color c = new Color(130, 50, 10);

        pink = new JButton("PINK");
        pink.setBounds(250, 250, 100, 40);
        pink.setFont(font);
        pink.setBackground(c);

        frame.add(pink);
        pink.addActionListener(this);

        frame.getContentPane().setBackground(Color.yellow);
        frame.setLayout(null);
        frame.setSize(650, 650);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(pink)) {
            frame.getContentPane().setBackground(Color.pink);
        }
    }

    public static void main(String[] args) {
        new buttonBackChange();
    }
}
