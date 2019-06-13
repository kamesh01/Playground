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
      int index = repeated_element(arr, size, freq);
      int max = max_index(freq, size, index);
      System.out.println(max);
    }
  	public static int repeated_element(int arr[], int size, int freq[]){
    	 int i;
        int count=0;
        int freq_idx = 0;
        for(i = 0; i < size ; i++)
        {
            if(arr[i] == 1)
            {
                count++;
            }
            if((arr[i] == 0) || (i == (size - 1)))
            {
                freq[freq_idx] = count;
                count = 0;
                freq_idx++;
            }
        }
        return freq_idx-1;
    }
  	public static int max_index(int freq[], int size, int index)
    {
        int max_no = 0;
        if((freq[0] > freq[1]) || (index == 0))
        {
            max_no = freq[0];
        }
        else
        {
            max_no = freq[1];
        }
        for(int i = 2; i < index ; i++)
        {
            if(max_no < freq[index])
            { 
                max_no = freq[index];
            }
        }
   		return max_no;
    }
}