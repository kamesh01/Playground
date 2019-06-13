import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n = in.nextInt();
        int temp = 0;
        for(int i=1 ; i<=n ; i++) {
            for(int j=1 ; j<=i ; j++) {
                if(temp == 0) {
                    System.out.print("*");
                    temp = 1;
                }
                else {
                    System.out.print("#");
                    temp = 0;
                }
     
            }
            System.out.println("");
        }
    }
}