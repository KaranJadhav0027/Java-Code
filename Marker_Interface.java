import java.util.*;
interface ProductMarker
{
}
class Product implements ProductMarker
{
	int id;
	String name;
	int cost;
	int qty;
	int cnt;
	void Product()
	{
		id=0;
		name=" ";
		cost=0;
		qty=0;
	}
	void Product(int ID,String name,int cost,int qty)
	{
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.qty=qty;
		this.cnt++;
	}
}
public class Marker_Interface
{
	public static void main(String []args)
	{
	    int cnt=0;
        Scanner a=new Scanner(System.in);
 		System.out.println("How many products do you want ?");
		int no=a.nextInt();
		System.out.println("\n");
		Products product[]=new Product[name];
		System.out.println("Enter product Data : ");
		for(int k=0;k<no;k++)
		{
			System.out.println("Product ID : ");
			int ID=a.nextInt();
			System.out.println("Product Name : ");
			String name=a.next();
			System.out.println("Product Cost : ");
			int cost=a.nextInt();
			System.out.println("Product Quantity : ");
			int qty=a.nextInt();
			System.out.println("\n");
			Product[k] =new Product(ID,name,cost,qty);
			cnt++;
		}
		if(Marker_Interface[] instanceof ProductMarker)
		{
			System.out.println("Class is using Product Marker!!!");	
		}
		System.out.println("---------------Product Details------------");
		for(Product Product:Marker_Interface)
		{
			System.out.println("Product ID = "+Product.ID);
			System.out.println("Product Name = "+Product.name);
			System.out.println("Product cost = "+Product.cost);
			System.out.println("Product Quantity = "+Product.qty);
			System.out.println("\n");
		}
		System.out.println("Total Object craeted is "+cnt);
	}
}