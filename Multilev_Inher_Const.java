class multi
{
    protected String S;
    multi()
    {
         S="Vishnu";
    }
}
class name1 extends multi
{
    name1()
    {
        S=S.concat(" Param");
    }
}
class name2 extends name1
{
    name2()
    {
         S=S.concat(" Computers");
    }
} 
class name3 extends name2
{
    name3()
    {
        S=S.concat(" Malegaon");
    }
    void display()
    {
          System.out.println(" String = "+S);
    }
}
public class Multilev_Inher_Const
{
     public static void main(String []args)
     {
          name3 obj=new name3();
          obj.display();
     }
}