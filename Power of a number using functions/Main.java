import java.util.Scanner;
class Main{
  
  	public static int power(int base,int expo)
    {
      
      int ans=1;
     
      for(int i=1;i<=expo;i++)
      {
         
       ans = ans * base;
      }
      return ans;
      
        
      
  
    }
  
  
	public static void main (String[] args){
	    
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int p = power(a,b);
      System.out.println(p);
      
      
      
      
      
      
      
      
      // Type your code here
	}
}