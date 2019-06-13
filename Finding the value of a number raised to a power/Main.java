import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      	Scanner sc = new Scanner(System.in);
      	int base = sc.nextInt();
      	int exponent = sc.nextInt();
      	int count = 0, res = 1;
      	while(count < exponent){
        	res = res * base;
          	count++;
        }
      	System.out.println(res);
    }
}