//Slip1_1
/*import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI extends JFrame implements ActionListener
{
	static JLabel L1;
	static JLabel L2;
	static JLabel L3;
	static JButton B;
	static JRadioButton R1;
	static JRadioButton R2;
	static JRadioButton R3;
	static JCheckBox C1;
	static JCheckBox C2;
	static JCheckBox C3;
	static JTextField T1;
	static JTextField T2;
	static int cnt;
	
}*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUI extends JFrame implements ActionListener
{
    JLabel name,class1,hobbies,font,style,size;
    JButton clear_button;
    JRadioButton r1,r2,r3;
    JCheckBox c1,c2,c3;
    JTextField name_textfield,final_textfield;
    ButtonGroup b1;
    JPanel p1,p2;
    JComboBox fontcb,sizecb;
    JCheckBox bold,italic,underline;
    static int cnt;
    private StringBuffer s1 = new StringBuffer();
    
    GUI()
    {
        b1=new ButtonGroup();
        p1=new JPanel();
        p2=new JPanel();
        clear_button=new JButton("clear");
        clear_button.addActionListener(this);
        
        name=new JLabel("Your name");
        class1=new JLabel("Your class");
        hobbies=new JLabel("Your hobbies");
        font=new JLabel("font");
        style=new JLabel("style");
        size=new JLabel("size");
        name_textfield=new JTextField(20);
        final_textfield=new JTextField(30);
        
        
        r1=new JRadioButton("FY");
        r2=new JRadioButton("SY");
        r3=new JRadioButton("TY");
        
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        
        c1=new JCheckBox("Music");
        c2=new JCheckBox("Dance");
        c3=new JCheckBox("Sports");
        
        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
        
        fontcb=new JComboBox();
        fontcb.addItem("Arial");
        fontcb.addItem("Sans");
        fontcb.addItem("Monospace");
        
        bold=new JCheckBox("Bold");
        italic=new JCheckBox("Italic");
        underline=new JCheckBox("Underline");
        
        size=new JLabel("Size");
        
        sizecb=new JComboBox();
        sizecb.addItem("10");
        sizecb.addItem("15");
        sizecb.addItem("18");
        
        p1.setLayout(new GridLayout(5,2));
        
        p1.add(name);
        p1.add(name_textfield);
        
        p1.add(class1);
        p1.add(hobbies);
        p1.add(style);
        p1.add(font);
        
        p1.add(r1);
        p1.add(c1);
        p1.add(bold);
        p1.add(fontcb);
        
        p1.add(r2);
        p1.add(c2);
        p1.add(italic);
        p1.add(size);
        
        p1.add(r3);
        p1.add(c3);
        p1.add(underline);
        p1.add(sizecb);
        
        p2.setLayout(new FlowLayout());
        p2.add(clear_button);
        p2.add(final_textfield);
        
        setLayout(new BorderLayout());
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.EAST);
        
        setSize(400,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==r1)
        {
            cnt++;
            if(cnt==1)
            {
                String s = name_textfield.getText();
                s1.append("Name : ");
                s1.append(s);
            }
            s1.append("Class : FY");
        }
        else if(e.getSource()==r2)
        {
            cnt++;
            if(cnt==1)
            {
                String s = name_textfield.getText();
                s1.append("Name : ");
                s1.append(s);
            }
            s1.append("Class : SY");
        }
        else if(e.getSource()==r3)
        {
            cnt++;
            if(cnt==1)
            {
                String s = name_textfield.getText();
                s1.append("Name : ");
                s1.append(s);
            }
            s1.append("Class : TY");
        }
        
        else if(e.getSource()==c1)
        {
            s1.append("Hobbies : MUsic");
        }
        else if(e.getSource()==c2)
        {
            s1.append("Hobbies : Dance");
        }
        else if(e.getSource()==c3)
        {
            s1.append("Hobbies : Sports");
        }
        
        final_textfield.setText(new String(s1));
        
        if(e.getSource()==clear_button)
        {
            final_textfield.setText(" ");
            name_textfield.setText(" ");
        }
        
        String f = (String)fontcb.getSelectedItem();
        System.out.println("font = "+f);
        final_textfield.setFont(new Font(f,Font.BOLD,10));
        String no = (String)sizecb.getSelectedItem();
        int num=Integer.parseInt(no);
        
        if(bold.isSelected())
        {
            final_textfield.setFont(new Font(f,Font.BOLD,num));
        }
        if(italic.isSelected())
        {
            final_textfield.setFont(new Font(f,Font.ITALIC,num));
        }
    }
    
    public static void main(String args[])
    {
        GUI s = new GUI();
    }
}