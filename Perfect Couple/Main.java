import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      for(int i = 0; i <= size-1; i++){
         arr[i] = sc.nextInt();
      }
      int value = sc.nextInt();
      perfect_couple(arr,size,value);
    }
  public static void perfect_couple(int arr[], int size, int value){
     for(int i = 0; i <= size-1; i++){
        for(int j = i+1; j <= size-1; j++){
           int sum = arr[i] + arr[j];
          if(sum == value){
             System.out.println(arr[i]+", "+arr[j]);
          }
        }
     }
  }
}