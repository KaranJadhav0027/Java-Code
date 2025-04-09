//Slip1_2
import java.io.*;
public class Menu_Driven
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
		{
		    System.out.println("1.Volume of Cylinder ");
		    System.out.println("2.Factorial of a number ");
		    System.out.println("3.Number is Armstrong or not ");
		    System.out.println("4.Exit ");
		    System.out.println("Enter your choice : ");
		    int ch=Integer.parseInt(br.readLine());
		    switch(ch)
		   {
			    case 1:
			        System.out.println("Enter radius and height of the cylinder : ");
				    double r=Double.parseDouble(br.readLine());
	        	    double h=Double.parseDouble(br.readLine());
				    double vol=3.142*r*r*h;
				    System.out.println("Volume of cylinder = "+vol);
				    break;
			    case 2:
			        int fact=1;
			        System.out.println("Enter any number : ");
			        int num=Integer.parseInt(br.readLine());
				    while(num>0)
				   {
					  fact=fact*num;
					  num--;
				   }
				   System.out.println("Factorial of a number = "+fact);
				   break;
			    case 3:
				   int sum=0,rem,temp,n;
			       System.out.println("Enter any number");
				   n=Integer.parseInt(br.readLine());
				   temp=n;
				   while(n>0)
				  {
      				 rem=n%10;
					 sum=sum+(rem*rem*rem);
					 n=n/10;
				  }
				  System.out.println("Sum = "+sum);
				  if(temp==sum)
				  {
					 System.out.println("Armstrong Number");
				  }
				  else
				  {
					 System.out.println("Not Armstrong Number");
				  }
				  break;
			    case 4:
			      System.exit(0);
                  break;				
			    default:
			      System.out.println("Invalid choice!!!");
		    }
		}
	}
}