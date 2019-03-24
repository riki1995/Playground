import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	
        Scanner in = new Scanner(System.in);
      int a_size = in.nextInt();
      int a[] = new int[a_size];
      for(int index = 0;index <= (a_size - 1);index++)
      {
        a[index] = in.nextInt();
      }
    zeroes(a_size,a);
    for(int index = 0;index <= (a_size - 1);index++)
      {
        System.out.print(a[index]+" ");
      }
  }
  public static void zeroes(int a_size, int a[])
  {
    int count = 0;
    for(int index = 0;index <= (a_size - 1);index++)
    {
      if(a[index] != 0)
      {
        int temp = a[index];
            a[index] =  a[count];
            a[count] = temp;
            count++;
      }
    }
  }
  
    
    
    
    
    
    //Try your code here
  	}
