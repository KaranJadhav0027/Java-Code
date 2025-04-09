//program for private member
class Member
{
    private String name;	
}
public class B_PrivateMem
{
	public static void main(String []args)
	{
		Member M=new Member();
		M.name="Nalini"; //access private variable from anothe class
        System.out.println("Name = "+M.name);		
	}
}