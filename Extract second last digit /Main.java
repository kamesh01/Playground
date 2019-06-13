import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int answer = (num/10)%10;
      System.out.println(answer);
	}
}