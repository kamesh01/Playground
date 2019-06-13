import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int arr[] = new int[size];
       for(int i = 0; i <= size - 1; i++){
           arr[i] = sc.nextInt();
       }
       subsets_of_size_3(arr,size);
    }
  
    public static void subsets_of_size_3(int arr[], int size)
    {
        for(int i = 0; i <= size - 2; i++)
        {
            for(int j = i + 1; j <= size - 1; j++)
            {
                for(int k = j + 1; k <= size - 1; k++)
                {
                    System.out.print("(" + arr[i] + "," + " " + arr[j] + "," + " " + arr[k] + ")" + " ");
                }
            }
            System.out.println();
        }
    }
}