import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i <= n - 1; i++){
        	arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        // Sorting the given array
        selection_sort(n, arr);
      	//  Printing the k th largest number
        System.out.println(arr[n-k]);
    }
  	// Function for Sorting the array elements
    public static void selection_sort(int n, int arr[]){
    	for(int start_index = 0; start_index <= n - 2; start_index++)
        {
        	int min_index = find_minimun_idx(start_index, arr, n-1);
            swap(arr, start_index, min_index);
        }
    }
  	//
    public static void swap(int arr[], int start_index, int min_index){
    	int temp = arr[start_index];
        arr[start_index] = arr[min_index];
        arr[min_index] = temp;
    }
  	// Finding minimum index
     public static int find_minimun_idx(int start_index, int arr[], int end_index){
         int min_index = 0;
         if(arr[start_index] < arr[start_index + 1])
         {
             min_index = start_index;
         }
         else{
             min_index = start_index + 1;
         }
         for(int i = start_index + 2; i <= end_index; i++){
             if(arr[min_index] > arr[i])
             {
                 min_index = i;
             }
         }
         return min_index;
    }   
}