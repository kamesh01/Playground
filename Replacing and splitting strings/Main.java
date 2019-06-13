import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      	//Try your code here
      	Scanner sc = new Scanner(System.in);
      	String str1 = sc.nextLine();
      	String str2 = sc.nextLine();
      	int no_of_parts = sc.nextInt();
      	String new_str = str1.replace(str1, str2);
      	// Splitting string array
      	String str_arr[] = new_str.split(" ",no_of_parts);
      	// Printing the splited array
      	for(String res: str_arr){
        	System.out.println(res);
        }
    }
}