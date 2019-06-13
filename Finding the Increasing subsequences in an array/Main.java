import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    	Scanner sc = new Scanner(System.in);
    	int size = sc.nextInt();
    	int arr[] = new int[size];
    	for(int i = 0; i < size; i++){
	    	arr[i] = sc.nextInt();
    	}
    	int sub_arr[] = new int[3*size];
    	increasing_sub_seq(arr, size, sub_arr);
  }
  public static void increasing_sub_seq(int[] arr, int size, int[] sub_arr){
  	for(int i = 0; i < size; i++){
    	int key = arr[i];
      	for(int j = i+1; j < size; j++){
        	if(arr[j] > key){
            	System.out.println(key + "," + arr[j] + " ");
            }
        }
    }
  }
}