import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      	Scanner sc = new Scanner(System.in);
      	int num = sc.nextInt();
      	System.out.println(sum_of_numbers(num));
    }
  	public static int sum_of_numbers(int n){
    	if(n != 0){
        	return n + sum_of_numbers(n - 1);
        }
      	else{
          	return n;
        }
    }
}