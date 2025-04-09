/*S11Q2   Write a program to accept the username and password from user if username and password are
not same then raise "Invalid Password" with appropriate msg.*/
import java.util.Scanner;

public class Password
{
    public static boolean isValid(String password)
    {
	if (!((password.length() >= 8) && (password.length() <= 15))) 
    {
            return false;
	}
	if (password.contains(" ")) 
    {
            return false;
	}
    if (true) 
    {
        int count = 0;
        for (int i = 0; i <= 9; i++) 
	    {
		String str1 = Integer.toString(i);
		if (password.contains(str1)) 
        {
            count = 1;
		}
        }    
        if (count == 0) 
        {
		   return false;
        }
	}
	if (!(password.contains("@") || password.contains("#") 
            || password.contains("!") || password.contains("~")
			|| password.contains("$") || password.contains("%")
			|| password.contains("^") || password.contains("&")
			|| password.contains("*") || password.contains("(")
			|| password.contains(")") || password.contains("-")
			|| password.contains("+") || password.contains("/")
			|| password.contains(":") || password.contains(".")
			|| password.contains(", ") || password.contains("<")
			|| password.contains(">") || password.contains("?")
			|| password.contains("|"))) 
    {
        return false;
	}
	if (true) 
    {
        int count = 0;
        for (int i = 65; i <= 90; i++) 
        {
		    char c = (char)i;
        	String str1 = Character.toString(c);
            if (password.contains(str1)) 
            {
               count = 1;
		    }
        }    
        if (count == 0) 
        {
	    	return false;
        }
	}
    if (true) 
    {
        int count = 0;
        for (int i = 97; i <= 122; i++) 
        {
	     	char c = (char)i;
		    String str1 = Character.toString(c);
		    if (password.contains(str1)) 
            {
               count = 1;
	     	}
        }
        if (count == 0) 
        {
            return false;
        }
	}
	return true;
	}
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username");
        String usrname = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();
        if (isValid(usrname)) 
        {
            System.out.println(usrname + " - Valid User");
	    }
	    else
        {
            System.out.println(usrname + " - Invalid User!");
	    }
        if (isValid(password)) 
        {
            System.out.println(password + " - Valid Password");
	    }
	    else
        {
            System.out.println(password + " - Invalid Password!");
	    }
    }
}