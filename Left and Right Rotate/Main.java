import java.util.Scanner;
class Main 
{
   public static void left(int a_size, int a[], int no_of_rotation )
  {
    int first = 1;
     int last;
     if(a_size % 2 == 0)
     {
       last = a_size - 1;
     }
     else
     {
       last = a_size - 2;
     }
     for(int rot = 1;rot <= no_of_rotation; rot++)
     {
       int temp = a[first];
       for(int index = 3;index < a_size; index = index + 2)
       {
         a[index - 2] = a[index];
       }
       a[last] = temp;
     }
   }
     
     public static void right(int a_size, int a[], int no_of_rotation )
  {
    int first = 0;
     int last;
     if(a_size % 2 == 1)
     {
       last = a_size - 1;
     }
     else
     {
       last = a_size - 2;
     }
     for(int rot = 1;rot <= no_of_rotation; rot++)
     {
       int temp = a[last];
       for(int index = (last - 2);index >= 0; index = index - 2)
       {
         a[index + 2] = a[index];
       }
       a[first] = temp;
     }
   }
     
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static void main(String args[])
    {
    	
        Scanner in = new Scanner(System.in);
      int a_size = in.nextInt();
      int a[] = new int[a_size];
      for(int index = 0;index <= (a_size - 1);index++)
      {
        a[index] = in.nextInt();
      }
    int no_of_rotation = in.nextInt();
    left(a_size,a,no_of_rotation);
    right(a_size,a,no_of_rotation);
    for(int index = 0;index <= (a_size - 1);index++)
      {
        System.out.print(a[index]+" ");
      }
  }
 
  
    
    
    
    
    
    //Try your code here
  	}
