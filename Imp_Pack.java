import Nalini.Pack_Circle;
import Nalini.Pack_Rect;
import java.util.*;
public class Imp_Pack
{
	public static void main(String []args)
	{
		Pack_Circle C=new Pack_Circle();
		Pack_Rect R=new Pack_Rect();
		int ch=0;
		do
		{
			System.out.println("-----MENU-----");
			System.out.println("1:Area of Circle ");
			System.out.println("2:Area of Rectangle ");
			System.out.println("-------------------");
			System.out.println("Enter your choice : ");
			Scanner scan=new Scanner(System.in);
            ch=scan.nextInt();
            switch(ch)
			{
				case 1:
				     System.out.println("Enter the radius : ");
					 float r=scan.nextFloat();
					 C.area_circle(r);
					 break;
				case 2:
				     System.out.println("Enter length and breadth of the rectangle : ");
					 int l=scan.nextInt();
					 int b=scan.nextInt();
					 R.area_rect(l,b);
					 break;
				default:
				     System.out.println("We can find area of circle and rectangle only !!!");
			}			
			System.out.println("Do you want to continue , press '1': ");
			ch=scan.nextInt();
		}while(ch==1);
	}
}