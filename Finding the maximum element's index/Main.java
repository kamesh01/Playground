import java.util.Scanner;
class Main
{
  public static int max_index;
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i <= n-1; i++){
       arr[i] = sc.nextInt();
    }
    if(arr[0] > arr[1]){
       max_index = 0;
    }else
      max_index = 1;
    max_element_index(arr, n);
  }
  public static void max_element_index(int arr[], int n){
     for(int i = 2; i <= n-1; i++){
        if(arr[max_index] < arr[i]){
           max_index = i;
        }
     }
    System.out.println(max_index);
  }
}