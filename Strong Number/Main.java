import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int n = num;
      int sum = 0;
      while(num >0){
         int rem = num % 10;
        int fact = 1;
        for(int i=1; i<=rem; i++){
           fact = fact*i;
        }
        sum = sum + fact;
        num = num / 10;
      }
      if(n == sum){
         System.out.println("Yes");
      }
      else{
         System.out.println("No");
      }
	}
}