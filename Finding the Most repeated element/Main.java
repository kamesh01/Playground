import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      for(int i = 0; i < size; i++){
      	arr[i] = sc.nextInt();
      }
      int freq[] = new int[size];
      System.out.println(mostFrequent(arr, size, freq));
  }
  public static int mostFrequent(int arr[], int n, int freq[]) 
	{ 
	    int max_count_idx = 0; 
		int curr_count = 1; 
		
	    for(int i = 0; i < n; i++)
	    {
		    for (int j = i+1; j < n; j++) 
		    { 
	            if(arr[i] == arr[j])
	            curr_count ++;
		    }
		    freq[i] = curr_count;
		    curr_count = 1;
	    } 
	    for( int i = 0; i < n; i++)
	    {
            if(freq[i]>freq[max_count_idx])
            max_count_idx = i;
	    }
	    return arr[max_count_idx];
	}
}