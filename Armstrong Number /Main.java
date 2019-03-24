import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   
        Scanner in = new Scanner(System.in);
      	int num = in.nextInt();
      	int copy = num;
      	int digits = 0;
      	if(num == 0)
        { 
          System.out.println(num);
        }
      	else
        {
          while(num > 0)
          {
            digits++;
            num = num / 10;
          }
        }
      	num = copy;
      int sum =0;
      int pow = 1;
      while(num > 0)
      {
        int rem = num % 10;
        for(int count=1;count<=digits;count++)
        {
          pow = pow * rem;
        }
       sum = sum + pow;
        pow = 1;
        num = num / 10;
      }
      if(sum == copy)
      {
        System.out.print("Armstrong Number");
      }
      else
      {
        System.out.print("Not a Armstrong Number");
      }
        
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      // Type your code here
	}
}