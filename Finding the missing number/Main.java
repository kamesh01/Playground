import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      int missing_val = 0;
      // Initializing elements of the array
      for(int i = 0; i < size; i++){
      	arr[i] = sc.nextInt();
      }
      // Find missing number function is called
      missing_number(arr, size, missing_val);
    }
  	public static void missing_number(int arr[], int size, int missing_val){
    	for(int i = 0; i < size; i++){
        	boolean found = false;
          	for(int j = 0; j < size; j++){
            	if(arr[j] == i+1){
                	found = true;
                  	break;
                }
            }
          	if(found == false){
            	missing_val = i+1;
              	break;
            }
        }
      	System.out.println(missing_val);
    }
}