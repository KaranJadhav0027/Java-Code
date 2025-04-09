class Thread_first extends Thread
{
	public void display()
	{
		System.out.println("Welcome to param computers !");
	}
	public static void main(String []args)
	{
		Thread_first t=new Thread_first();
		t.display();
	}
}