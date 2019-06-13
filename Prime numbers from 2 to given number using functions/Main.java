import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      for(int i=2; i<=num; i++){
         if(check_prime(i)){
            System.out.println(i);
         }
      }
	}
  public static boolean check_prime(int n){
     boolean temp = true; 
    if(n != 0){
       for(int j=2; j<=n/2; j++){
          if(n%j == 0){
             temp = false;
             break;
          }
       }
    }
    return temp;
}
}