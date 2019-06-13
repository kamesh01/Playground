import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int num = 0;
    int reverse=0;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    while(num != 0){
      reverse = reverse * 10;
      reverse = reverse + num%10;
      num = num/10;
    }
    int result = reverse;
    
    System.out.println(result);
  }
}