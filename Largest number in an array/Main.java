import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
       Scanner in = new Scanner(System.in);

       int arr_size = in.nextInt();
       int arr[] = new int[arr_size];

       for(int idx = 0; idx <= arr_size - 1; idx++)
       {
           arr[idx] = in.nextInt();
       }
       int max_no = arr[0];
       
       for(int idx = 0; idx <= arr_size - 1; idx++)
       {
           if(max_no < arr[idx])
              {
                max_no = arr[idx];
              }
       }
       System.out.println(max_no);
    }
}