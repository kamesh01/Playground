import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      	Scanner sc = new Scanner(System.in);
      	String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        StringBuilder sb3 = new StringBuilder(str3);
        StringBuilder temp = new StringBuilder("");
        int sb1_len = sb1.length();
        int sb2_len = sb2.length();
        int sb3_len = sb3.length();
   		int i, j;
      
      	// Process is started after decalration
        for(i = 0; i <= (sb1_len - 1) - (sb2_len - 1); i++)
        {
            boolean is_matching = true;
            for(j = 0; j < sb2_len; j++)
            {
              	// CHecking if the word is present in the original string or not
                if(sb1.charAt(i + j) != sb2.charAt(j))
                {
                    is_matching = false;
                }
            }
            if(is_matching == true)
            {
              String strng = sb3.substring(0, sb3_len);
              temp.append(strng);
              i = i + (sb2_len - 1);
            }
            else
            {
                char ch = sb1.charAt(i);
                temp.append(ch);
            }
        }
      // Printing the altered temp srting array
        for(j = i ; j <= (sb1_len - 1); j++)
        {
                char ch = sb1.charAt(j);
                temp.append(ch);
        }
        System.out.print(temp);
    }
}