import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      	Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i = 1; i <= row; i++)
        {
            for(int j = col; j > col - i ; j--)
            {
                System.out.print(j);
            }
           	for(int j = 1; j <= col - i; j++)
            {
                System.out.print(row - i + 1);
            }
            System.out.println();
        }
    }
}