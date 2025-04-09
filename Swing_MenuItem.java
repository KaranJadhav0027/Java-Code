import javax.swing.*;  
class Swing_MenuItem
{  
          JMenu menu, submenu;  
          JMenuItem i1, i2, i3, i4, i5, i6, i7;  
          Swing_MenuItem()
          {  
          JFrame f= new JFrame("Menu and MenuItem Example");  
          JMenuBar mb=new JMenuBar();  
          menu=new JMenu("FILE");  
          i1=new JMenuItem("NEW");  
          i2=new JMenuItem("OPEN");  
          i3=new JMenuItem("SAVE"); 
          submenu=new JMenu("SAVE AS"); 
          i4=new JMenuItem("docx");  
          i5=new JMenuItem("pdf");
          i6=new JMenuItem("img");
          i7=new JMenuItem("ppt");
          menu.add(i1); menu.add(i2); menu.add(i3);  
          submenu.add(i4); submenu.add(i5); submenu.add(i6); submenu.add(i7);  
          menu.add(submenu);  
          mb.add(menu);  
          f.setJMenuBar(mb);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);  
}  
public static void main(String args[])  
{  
new Swing_MenuItem();  
}
}  