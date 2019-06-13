import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int num3 = sc.nextInt();
      if(num1>num2 && num1>num3){
         System.out.println(num1);
      }
      else if(num2>num1 && num2>num3){
         System.out.println(num2);
      }
      else{
         System.out.println(num3);
      }
	}
}