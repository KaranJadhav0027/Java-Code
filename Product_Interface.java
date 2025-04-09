import java.io.*;
interface ProductMarker
{	
}
class Product implements ProductMarker
{
	int id;
	String name;
	int cost;
	int quantity;
	int count;
	Product()
	{
		id=0;
		name=" ";
		cost=0;
		quantity=0;
	}
	Product(int id,String name,int cost,int quantity)
	{
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.quantity=quantity;
		this.count++;
	}
}
class Product_Interface
{
	public static void main(String []args)throws IOException
	{
		int count=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many products do you want ? ");
		int n=Integer.parseInt(br.readLine());
		System.out.println("\n");
		Product Product_Interface[]=new Product[n];
		System.out.println("Enter product data : ");
		for(int k=0;k<n;k++)
		{
			System.out.println("Enter id:");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter Name:");
			String name=br.readLine();
			System.out.println("Enter cost:");
			int cost=Integer.parseInt(br.readLine());
			System.out.println("Enter Quantity:");
			int quantity=Integer.parseInt(br.readLine());
			System.out.println("\n");
			Product_Interface[k]=new Product(id,name,cost,quantity);
			count++;
		}
		if(Product_Interface[0] instanceof ProductMarker)
		{
			System.out.println("Class is using ProductMarker");
		}
		System.out.println("Product Details are :");
		for(Product product:Product_Interface)
		{
			System.out.println("ID="+product.id);
			System.out.println("Name="+product.name);
			System.out.println("Cost="+product.cost);
			System.out.println("Quantity="+product.quantity);
		}
		System.out.println("Total object is "+count);
	}
}