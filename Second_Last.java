public class Second_Last
{
   public static void main(String args[])
   {
      int i,temp, size;
      int array[] = {78,56,45,74,12,2,3};
      size = array.length;
      for(i = 0; i<size; i++ )
	  {
         for(int j = i+1; j<size; j++)
		 {
            if(array[i]>array[j])
			{
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
	  System.out.println("1st Smallest elementof the array is :: "+array[0]);
      System.out.println("2nd Smallest element of the array is :: "+array[1]);
   }
}