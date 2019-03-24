import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
         Scanner in = new Scanner(System.in);
         int base = in.nextInt();
         int expo = in.nextInt();
         int count = 0, a = 1;
         while(count < expo)
         {
           a = a * base;
           count++;
         }
       System.out.println(a);
    }
}