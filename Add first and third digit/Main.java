import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int first_digi = n / 100;
      int third_digi = n % 10;
      System.out.println(first_digi+third_digi);
	}
}
