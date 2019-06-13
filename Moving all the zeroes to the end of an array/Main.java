import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
       Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int i = 0; i <= arr_size - 1; i++){
           arr[i] = sc.nextInt();
       }
      zeroes_at_the_end(arr_size, arr);
      for(int i = 0; i <= arr_size - 1; i++){
           System.out.print(arr[i] + " ");
      }
    }
    public static void zeroes_at_the_end(int arr_size, int arr[])
    {
        int count = 0;
        for(int i = 0; i <= arr_size - 1; i++){
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
}