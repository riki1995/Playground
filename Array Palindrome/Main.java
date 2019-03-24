import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++){
            arr[idx] = sc.nextInt();
        }
        int left = 0;
        int right = n - 1;
        boolean pa = true;

       while(left <= right)
        {
           
            if(arr[left] != arr[right])
            {
                  pa = false;
                  break;
            }
            left++;
            right--;
       }
            if(pa == true){
             System.out.print("Yes");
            }
            else{
            System.out.print("No");
            }
          
            
        
     
    }
}