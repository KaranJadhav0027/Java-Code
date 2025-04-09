//program for class and object
class student
{
	int rno;
	String name;
}
public class B_cls_obj
{
	public static void main(String []args)
	{
		student S=new student();
		S.rno=1;
		S.name="Nalini";
		System.out.println("Roll no : "+S.rno);
		System.out.println("Name : "+S.name);
	}
}