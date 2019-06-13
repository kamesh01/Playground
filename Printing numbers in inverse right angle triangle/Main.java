import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
  		Scanner in = new Scanner(System.in);
  		int n = in.nextInt();
        int temp = n;
        for(int i=1 ; i<=n ; i++) {
            for(int j=temp;j>=1;j--) {
               System.out.print(j);
            }
          temp--;
            System.out.println("");
        }
    }
}