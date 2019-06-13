import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    	// type your code here
    	Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int temp = num;
    	int count = 0;
		// this is to convert any number to the positive number if it is negative
    	if(num < 0)
        {
            num = num * -1;
        }
    	// here getting the length of the integer to character array
        while(num > 0)
        {
            count++;
            num = num / 10;
        }
    	
        if(temp < 0)
            count = count + 1;
        char arr[] = new char[count];
        if(temp < 0)
        {
            temp = temp * -1;
            arr[0] = '-';
        }
        count = count - 1;
        while(temp > 0)
        {
            char ch = (char)((temp % 10) + '0');
            arr[count] = ch;
            temp = temp / 10;
            --count;    
        }
        System.out.print(arr);
  }
}