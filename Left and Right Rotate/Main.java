import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
       Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int arr[] = new int[arr_size];
        for(int i = 0; i <= (arr_size - 1); i++)
        {
            arr[i] = sc.nextInt();
        }
        int no_of_rotation = sc.nextInt();
        left_rotate_even_elem(arr_size, arr, no_of_rotation);
        right_rotate_odd_elem(arr_size, arr, no_of_rotation);
    
    for(int i = 0; i <= (arr_size - 1); i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void left_rotate_even_elem(int arr_size, int arr[], int no_of_rotation)
    {
       int first_even_elem_index = 1;
       int last_even_elem_index;
       if(arr_size % 2 == 0)
       {
           last_even_elem_index = arr_size - 1;
       }
       else
       {
           last_even_elem_index = arr_size - 2;
       }
       for(int rotation = 1; rotation <= no_of_rotation; rotation++)
       {
           int temp = arr[first_even_elem_index];
           for(int i = 3; i < arr_size; i = i + 2)
           {
               arr[i - 2] = arr[i];
           }
           arr[last_even_elem_index] = temp;
       }
    }
    public static void right_rotate_odd_elem(int arr_size, int arr[], int no_of_rotation)
    {
       int first_odd_elem_index = 0;
       int last_odd_elem_index;
       if(arr_size % 2 == 1)
       {
          last_odd_elem_index = arr_size - 1;
       }
       else
       {
          last_odd_elem_index = arr_size - 2;
       }
       for(int rotation = 1; rotation <= no_of_rotation; rotation++)
       {
           int temp = arr[last_odd_elem_index];
           for(int i = (last_odd_elem_index - 2); i >= 0; i = i - 2)
            {
               arr[i + 2] = arr[i];
           }
           arr[first_odd_elem_index] = temp;
       }
    }
}