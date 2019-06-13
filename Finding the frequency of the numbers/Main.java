import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
      	// Taking values from user to add into an array
        for(int i = 0; i <= n - 1; i++){
            arr[i] = sc.nextInt();
        }
      	
        // Inititally all the values will be zero in the array
      	int freq[] = new int[k];
      
        for(int i = 0; i <= n - 1; i++){
           freq[arr[i] - 1]++;
        }
        for(int i = 0; i <= k - 1; i++){
           System.out.println((i + 1) + " " + freq[i]);
        }
    }
}