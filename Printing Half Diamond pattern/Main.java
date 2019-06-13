import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
  		Scanner in = new Scanner(System.in);
  		int n = in.nextInt();
        for(int i=1 ; i<=n ; i++) {
            for(int j=n;j>=i+1;j--) {
               System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
               System.out.print("*");
            }
            for(int l=2;l<=i;l++){
               System.out.print("*");
            }
            System.out.println("");
        }
    }
}