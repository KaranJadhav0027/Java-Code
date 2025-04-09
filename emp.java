class emp
{
	String ename,des;
	int eid,sal;
	emp(int eid,String ename,String des,int sal)
	{
		this.eid=eid;
		this.ename=ename;
		this.des=des;
		this.sal=sal;
	}
	public String toString()
	{
		return eid+" "+ename+" "+des+" "+sal;
	}
	public static void main(String []args)
	{
		emp obj=new emp(1,"nalini","abcd",54163);
		System.out.println(obj.toString());
	}
}