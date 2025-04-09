//give the file name to the command line
import java.io.BufferedReader;  
import java.io.File;
import java.io.FileReader;  
public class Cnt_wrd_line
{  
    public static void main(String[] a)throws Exception 
    {  
        String line;  
        int countword = 0,countline=0;  
        String File=a[0];
        //Opens a file in read mode  
        FileReader file = new FileReader(File);  
        BufferedReader br = new BufferedReader(file);  
              
        //Gets each line till end of file is reached  
        while((line = br.readLine()) != null) 
        {  
            //Splits each line into words  
            String ln[]=line.split("\n");
            String words[] = line.split(" ");  
            //Counts each word  
            countword = countword + words.length;  
            countline = countline + ln.length;
        }  
          
        System.out.println("Number of words present in given file: " + countword);  
        System.out.println("Number of line present in given file: " + countline);
        br.close();  
    }  
}  