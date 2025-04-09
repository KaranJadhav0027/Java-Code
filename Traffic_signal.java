import java.applet.*;
import java.awt.*;
/*<Applet code="Traffic_signal" width=400 height=400></Applet>*/
public class Traffic_signal extends Applet implements Runnable
{
	static int x;
	public void init()
	{
		Thread tx=new Thread(this);
		tx.start();
	}
	public void run()
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawRect(100,100,200,400);
		g.drawOval(120,120,100,100);
		g.drawOval(120,240,100,100);
		g.drawOval(120,360,100,100);
		if(x==0)
		{
			g.setColor(Color.red);
			g.fillOval(120,120,100,100);
			x=1;
		}
		else if(x==1)
		{
			g.setColor(Color.yellow);
			g.fillOval(120,240,100,100);
			x=2;
		}
		else if(x==2)
		{
			g.setColor(Color.green);
			g.fillOval(120,360,100,100);
			x=0;
		}
		try
		{
			if(x==1)
			{
				Thread.sleep(5000);
			}
			else if(x==2)
			{
				Thread.sleep(1000);
			}
			else if(x==0)
			{
				Thread.sleep(5000);
			}
		}
		catch(Exception e)
		{ }
		repaint();
	}
}