//Slip2_1
/*Write a program to read the First Name and Last Name of a person, his weight and height using 
 command line arguments. Calculate the BMI Index which is defined as the individual's body mass 
 divided by the square of their height.
 (Hint : BMI = Wts. In kgs / (ht)2
)
*/
import java.io.*;
import java.util.Scanner;
class Slip2_1
{
    public static void main(String []args)
    {
        String a,b;
        float w,h,t;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first name and last name and weight,height :");
        a=scan.nextLine();
        b=scan.nextLine();
        w=scan.nextFloat();
        h=scan.nextFloat();
        t=w/(h*h);
        System.out.println(a+"  "+b);
        if(t<18.5)
            System.out.println("UnderWeight");
        else if(t>=18.5 && t<25)
            System.out.println("Normal");
        else if(t>=25 && t<30)
            System.out.println("OverWeight");
        else
            System.out.println("OBSERVE!!!");
    }
}