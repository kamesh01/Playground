import java.util.Scanner;
class Main
 {
     public static void main(String args[])
     {
       	// your code here
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[] = new int[n];
       	// taking array elements
         for(int i = 0; i < n; i++)
         {
             arr[i] = sc.nextInt();   
         }
         insertion_sort(n,arr);
     }
    public static void insertion_sort(int n,int arr[])
    {	
      	// sorting left side elements in ascending order
        for (int i = 1; i < n/2; i++) 
        {
            int key = arr[i];
            int j = i - 1;
            while((j >= 0) && (arr[j] > key)) // checking if the key element is smaller than its one step before element
            {
                arr[j + 1] = arr[j];	// if the while condition is true then swap both the elements
                j--;
            }
            arr[j + 1] = key;	// if while condition is not true then the key value will not be changed
        }
      	// sorting right side elements in decending order
        for (int i = n/2; i < n; i++) 
        {
            int key = arr[i];
            int j = i - 1;
            while((j >= n/2) && (arr[j] < key)) 
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
      	// printing all the elements of the array
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}