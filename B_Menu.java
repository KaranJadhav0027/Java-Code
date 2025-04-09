//program for menu
import java.awt.*;
import java.awt.event.*;
public class B_Menu
{
	private Frame f;
	private Label HL;
	private Label SL;
	private Panel CP;
	public B_Menu()
	{
		prepareGUI();
	}
	public static void main(String []args)
	{
		B_Menu menu=new B_Menu();
		menu.show();
	}
	private void prepareGUI()
	{
		f=new Frame("Java AWT examples");
		f.setSize(400,400);
		f.setLayout(new GridLayout(3,1));
		f.addWindowListener(new WindowAdapter()
		{
			public void WindowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		HL=new Label();
		HL.setAlignment(Label.CENTER);
		SL=new Label();
		SL.setAlignment(Label.CENTER);
		SL.setSize(350,100);
		CP=new Panel();
		CP.setLayout(new FlowLayout());
		f.add(HL);
		f.add(CP);
		f.add(SL);
		f.setVisible(true);
	}
	private void show()
	{
		final MenuBar M=new MenuBar();
		Menu fileMenu=new Menu("File");
		Menu editMenu=new Menu("Edit");
		final Menu aboutMenu=new Menu("About");
		MenuItem newMenuItem=new MenuItem("New",new MenuShortcut(KeyEvent.VK_N));
		newMenuItem.setActionCommand("New");
		MenuItem openMenuItem=new MenuItem("Open");
		openMenuItem.setActionCommand("Open");
		MenuItem saveMenuItem=new MenuItem("Save");
		saveMenuItem.setActionCommand("Save");
		MenuItem exitMenuItem=new MenuItem("Exit");
		exitMenuItem.setActionCommand("Exit");
		MenuItem cutMenuItem=new MenuItem("Cut");
		cutMenuItem.setActionCommand("Cut");
		MenuItem copyMenuItem=new MenuItem("Copy");
		cutMenuItem
	}
}