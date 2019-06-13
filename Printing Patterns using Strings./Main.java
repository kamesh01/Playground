import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int mid = n/2;	// taking half length of the string
        for(int i = n-1; i >= 0 ; i--)	// starting from last index of the string
        {
            int count = 0;
            for(int s = 0; s < i; s++)	// in this loop printing spaces
            {
            System.out.print(" ");
            count++;
            }
			// operation performing to print left half string
            if(i>=n/2)
            {
                int j = n/2; 
                while(count<n)
                {
                    System.out.print(str.charAt(j++));
                    count++;
                }
            }
          	// operation performing to print right half string
            else
            {
                int j = n/2;
                while(count<=(n/2+i))
                {
                    System.out.print(str.charAt(j++));
                    count++;
                }
              	// printing string after last char, again starting from the beginning of the string upto n
                j = 0;
                while(count < n)
                {
                    System.out.print(str.charAt(j++));
                    count++;
                }
            } // end of else
            System.out.println();
        }	// end of outer loop
    }
}