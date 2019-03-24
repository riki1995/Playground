import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    int max;
    for(int index = 0; index < n; index++)
    {
           list[index] = sc.nextInt();
    }
    max = 0;
    for(int idx = 1; idx <= n-1; idx ++)
    {
        if(list[max] < list[idx])
        {
          max = idx;
        }
    }
    System.out.println(max);
    
    
    
    
    
    //Try your code here
  }
}