import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    int i, j;
    // Taking elements into an array
    for(i = 0; i < size; i++){
    	arr[i] = sc.nextInt();
    }
    System.out.println(max_sum_seq(arr, size));
  }
  public static int max_sum_seq(int arr[], int size){
  	int sum, max_sum;
    sum = arr[0];
    max_sum = arr[0];
    for(int i = 1; i < size; i++){
    	if(arr[i] > arr[i - 1]){
        	sum += arr[i];
        }else{
      	sum = arr[i];
    }
    if(sum > max_sum){
    	max_sum = sum;
    }
    }
    return max_sum;// Returning the maximum sum
  }
}