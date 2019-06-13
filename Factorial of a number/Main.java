import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int fact = 1;
      for(int i=1; i<=num; i++){
         fact = fact*i;
      }
      System.out.println(fact);
	}
}