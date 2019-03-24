import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new  Scanner(System.in);
      	int n1 = in.nextInt();
      	int n2 = in.nextInt();
      	int n3 = in.nextInt();
      	int result = great(n1,n2);
      	System.out.print(great(result,n3));
      	
      
      
    }
      
   public static int great(int num1, int num2)
   {
     int max;
     if(num1 > num2)
     {
       max = num1;
     }
     else
     {
       max = num2;
     }
     return max;
   }
      
      
      
      // Type your code here
	
}