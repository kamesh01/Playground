import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
    	Scanner in = new Scanner(System.in);
        int flag = 0;
        int r = in.nextInt();
        int c = in.nextInt();
    	// here creating and taking user inputs for matrix 1
        int a[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                a[i][j] = in.nextInt();
            }
        }
    	// here creating and taking user inputs for matrix 2
        int b[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                b[i][j] = in.nextInt();
            }
        }
    	// checking whether it is identical matrix or not
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(a[i][j] != b[i][j])
                {
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0)
        	System.out.print("Yes");
        else
          	System.out.print("No");
  }
}