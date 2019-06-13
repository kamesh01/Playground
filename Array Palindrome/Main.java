import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      // Taking array elements
      for(int i = 0; i < size; i++){
      	arr[i] = sc.nextInt();
      }
      // Calling function to check plindrome or not
      array_palinfdrome(arr,size);
    }
  	public static void array_palinfdrome(int arr[], int size){
    	int front = 0;
      	int end = size-1;
      	boolean is_true = true;
      	while(front <= end){
        	if(arr[front] != arr[end]){
            	is_true = false;
              	break;
            }
          	front++;
          	end--;
        }
      	if(is_true == true){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}