import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int fact=1; fact<=n; fact++){
         if(n % fact == 0){
            System.out.println(fact);
         }
      }
	}
}