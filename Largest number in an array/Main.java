import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int arr[] = new int[arr_size];
       int i;
       int large = 0;
       
      for( i = 0; i < arr_size; i++)
      {
        arr[i] = in.nextInt();
      }
      for( i = 0; i < arr_size; i++)
      {
        
         if(large < arr[i])
         { 
             large = arr[i];
         }
      }
      System.out.println(large);
      
      
      
      
      
      
      
      
      
      // Type your code here
    }
}