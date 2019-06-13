import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int copy_n = n;
      int count = 0;
      if(n == 0){
         System.out.println(n);
      }else{
         while(n > 0){
            count++;
            n = n / 10;
         }
        n = copy_n;
        int sum = 0;
        int pow = 1;
        while(n>0){
           int rem = n % 10;
          for(int i=1; i<=count; i++){
             pow = pow * rem;
          }
          sum = sum + pow;
          pow = 1;
          n = n / 10;
        }
        if(sum == copy_n){
           System.out.println("Armstrong Number");
        }else
        {
          System.out.println("Not a Armstrong Number");
        }
      }
	}
}