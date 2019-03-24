import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int arr[] = new int[arr_size];
       int i;
       int a = 0;
       int b = 0;
      for( i = 0; i < arr_size; i++)
      {
        arr[i] = in.nextInt();
      }
      int search1 = in.nextInt();
      int search2 = in.nextInt();
      for( i = 0; i < arr_size; i++)
      {
        if(search1 == arr[i])
        {
          a = 1;
          System.out.println(i);
        }
        if(search2 == arr[i])
        {
          b = 1;
          System.out.println(i);
          
        }
      }
      if ( a != 1)
        System.out.println(-1);
      if ( b != 1)
        System.out.println(-1);
      
      
         
      
      
      
      
      
      
      
      
      // Type your code here
    }
}