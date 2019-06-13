import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      for(int i=0; i<=size-1; i++){
         arr[i] = sc.nextInt();
      }
      int elem_1 = sc.nextInt();
      int elem_2 = sc.nextInt();
      
      int elem_1_index = -1;
      int elem_2_index = -1;
      for(int i=0; i<=size-1; i++){
         if(elem_1 == arr[i]){
           elem_1_index = i;
         }
        if(elem_2 == arr[i]){
          elem_2_index = i;
         }
      }
      System.out.println(elem_1_index);
      System.out.println(elem_2_index);
    }
}