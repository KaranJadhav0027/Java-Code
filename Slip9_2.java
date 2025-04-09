//Slip9_2
/* Write a program to using marker interface create a class Product (product_id, product_name,
 product_cost, product_quantity) default and parameterized constructor. Create objectsof class 
 product and display the contents of each object and Also display the object count.*/
 
 import java.util.*;
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
 public class Slip9_2
 {
	 public static void main(String []args)
	 {
		 int count=0;
		 Scanner scan=new Scanner(System.in);
		 System.out.println("How many products : ");
		 int number=scan.nextInt();
		 System.out.println("\n");
		 Product Slip9_2[]=new Product[number];
		 System.out.println("Enter product data :");
		 for(int k=0;k<number;k++)
		 {
			 System.out.println("Product ID : ");
			 int id=scan.nextInt();
			 System.out.println("Product Name : ");
			 String name=scan.next();
			 System.out.println("Product cost : ");
			 int cost=scan.nextInt();
			 System.out.println("Product quantity : ");
			 int quantity=scan.nextInt();
			 System.out.println("\n");
			 Slip9_2[k]=new Product(id,name,cost,quantity);
			 count++;
		 }
		 if(Slip9_2[0] instanceof ProductMarker)
		 {
			 System.out.println("Class is using productMarker");
		 }
		 System.out.println("Product Details\n");
		 for(Product product:Slip9_2)
		 {
			 System.out.println("Product ID "+product.id);
			 System.out.println("Product name "+product.name);
			 System.out.println("Product cost "+product.cost);
			 System.out.println("Product Quantity "+product.quantity);
			 System.out.println("\n");
		 }
		 System.out.println("Total object is "+count);
	 }
 }