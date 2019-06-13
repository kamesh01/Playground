import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int num3 = sc.nextInt();
      int gdc =1;
      for(int i=1; i<=num1 && i<=num2 && i<=num3; i++){
         if(num1%i == 0 && num2%i == 0 && num3%i == 0){
            gdc = i;
         }
      }
      System.out.println(gdc);
	}
}