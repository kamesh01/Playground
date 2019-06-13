import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    	Scanner sc = new Scanner(System.in);
    	int size = sc.nextInt();
    	int arr[] = new int[size];
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sub_arr[] = new int[3 * size];
        strictly_increasing_sub_seq(size, arr, sub_arr);
  }
  public static void strictly_increasing_sub_seq(int size, int[] arr, int[] sub_arr){
  	for(int i = 0; i < size; i++)	// outer loop
        {
        	int key =  arr[i];
            int flag = 1;
            for(int j = i+1; j < size; j++)	// inner loop
            {
                if(arr[j] > key)
                {
                    for(int k = i; k <= j; k++)	// inner most loop
                    {
                        if(arr[k] > arr[j])
                        flag = 0;
                    }	// end of inner most loop
                    if(flag == 1)
                    System.out.println(key + "," + arr[j] + " ");
                }
                flag = 1;
            }	// end of inner loop
        }
  }
}