import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch(choice)
        {
          case 1:
            int side = in.nextInt();
            int area = side * side;
            System.out.println(area);
            break;
          case 2:
            int len = in.nextInt();
            int bred = in.nextInt();
            int a = len * bred;
            System.out.println(a);
            break;
          case 3:
            int base = in.nextInt();
            int height = in.nextInt();
            int arr = (base * height)/2;
            System.out.println(arr);
            break;
          case 4:
            int r = in.nextInt();
            double areas =  3.14 * r * r;
            System.out.println(areas);
            break;
        }
      
      
      
      
      //Try your code here
    }
}