import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      System.out.println((num1>num2)?"num1 is the greatest number":"num2 is the greatest number");
	}
}