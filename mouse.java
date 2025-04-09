import java.awt.*;
import java.awt.event.*;
class aditi extends Frame implements MouseListener
{
  
    TextField t,t1;
    Label l,l1;
    int x,y;
    Panel p;
    aditi(String title)
    {
      super(title);
      setLayout(new FlowLayout ());
      p=new panel();
      p.setLayout(new GridLayout(2,2,5,5));
      t=new TextField(20);
      l=new label("co ordinate click");
      l1=new label("co ordinate movement");
      t1=new TextField(20);
      p.add(t);
      p.add(l);
      p.add(l1);
      p.add(t1);
      add(p);
      addMouseListener(new M_Move());
      addMouseMotionListener(new M_Click());
      setSize(500,500);
      setVisible(true);
    }
    class M_Move extends MouseAdaptor
    {
      public void mouseClicked(MouseEvent e);
      {
        x=e.getX();
        y=e.getY();
        t1.setText("X="+x+"Y="+y);
      }
    }
    class M_Click extends MouseMotionAdaptor
    {
      public void mouseMoved(MouseEvent e)
      {
        x=e.getX();
        y=e.getY();
        t1.setText("X="+x+"Y="+y);
      }
  }
  }
  public class mouse
  {
    
  
  public static void main(String args[])
  {
  aditi f=new aditi("clicked and moved");
}
}