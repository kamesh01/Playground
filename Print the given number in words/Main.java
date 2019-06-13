import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
	int ch;
      if(num < 5){
      	ch = num;
        switch(ch){
          case 1 :
            System.out.println("One");
            break;
          case 2 :
            System.out.println("Two");
            break;
          case 3 :
            System.out.println("Three");
            break;
          case 4 :
            System.out.println("Four");
            break;
          case 5 :
            System.out.println("Five");
            break;
        }
      }else 
        System.out.println("Invalid");
	}
}