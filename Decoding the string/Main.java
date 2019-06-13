import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	int shift = sc.nextInt();
    	StringBuilder sb = new StringBuilder(str);
    	int str_len = sb.length();
    
    	for(int i = 0; i < str_len; i++){
    		char ch = sb.charAt(i);
        if(ch >= 'A' && ch <= 'Z')
        {
            ch = (char)(ch - shift);
            if(ch < 'A')
            {
            	ch = (char)(ch + 26);
            }
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            ch = (char)(ch - shift);
            if(ch < 'a')
            {
            	ch = (char)(ch + 26);
            }
        }
          sb.setCharAt(i, ch);
    	}
    	System.out.println(sb);
  }
}