public class Str_Conver
{
	public static void main(String []args)
	{
		Integer intWrapper=Integer.valueOf("1234");
		Integer intWrapper2=Integer.valueOf("11011",2);
		Integer intWrapper3=Integer.valueOf("D",16);
		System.out.println("Value of IntWrapper object : "+intWrapper);
		System.out.println("Value of IntWrapper2 object : "+intWrapper2);
		System.out.println("Value of IntWrapper3 object : "+intWrapper3);
		System.out.println("Hex value of IntWrapper : "+Integer.toHexString(intWrapper));
		System.out.println("Binary value of IntWrapper2 : "+Integer.toBinaryString(intWrapper2));
	}
}