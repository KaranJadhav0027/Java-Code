//Slip2_1
public class ASG_CMD
{
	private int x;
	public ASG_CMD()
	{
		x=0;
	}
	public ASG_CMD(int x)
	{
		this.x=x;
	}
	public Boolean isNegative()
	{
		if(x<0)
			return true;
		else
			return false;
	}
	public Boolean isPositive()
	{
		if(x>0)
			return true;
		else
			return false;
	}
	public Boolean isZero()
	{
		if(x==0)
			return true;
		else
			return false;
	}
	public Boolean isOdd()
	{
		if(x%2!=0)
			return true;
		else
			return false;
	}
	public Boolean isEven()
	{
		if(x%2==0)
			return true;
		else
			return false;
	}
	public static void  main(String []args)throws ArrayIndexOutOfBoundsException
	{
		int x=Integer.parseInt(args[0]);
		ASG_CMD obj=new ASG_CMD(x);
		if(obj.isNegative())
			System.out.println(x+" is negative number");
		if(obj.isPositive())
			System.out.println(x+" is positive number");
		if(obj.isZero())
			System.out.println("number is zero");
		if(obj.isOdd())
			System.out.println(x+" is odd number");
		if(obj.isEven())
			System.out.println(x+" is even number");
	}
}