import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      	//type your code;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int index = 0;index < n; index++)
        {
            arr[index] = sc.nextInt();   
        }
        insertion_sort(n, arr);
    }
  	// This is one of the sorting method. We can use any sorting technique
    public static void insertion_sort(int n,int arr[])
    {
        for (int i = 1; i < n/2; i++) 
        {
            int key = arr[i];
            int j = i - 1;
            while((j >= 0) && (arr[j] > key)) 
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
      	// printing elements of the array
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}