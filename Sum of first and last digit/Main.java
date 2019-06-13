import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int last_digi = n % 10;
      int total;
      while(n >=10){
      	n = n/10;
      }
      total = n + last_digi;
      System.out.println(total);
	}
}