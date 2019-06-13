import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	System.out.println(factorial(n));
  }
  	public static int factorial(int num){
    	if(num == 0){
        	return 1;
        }
      else {
      		return num * factorial(num - 1);
      }
    }
  
}