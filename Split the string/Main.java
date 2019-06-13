import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main{
    public static void main(String args[]){
          // type your code here
      	Scanner sc = new Scanner(System.in);
      	String str = sc.nextLine();
      	Pattern ptrn = Pattern.compile("(,| |and|or)");
      	
      	String[] parts = ptrn.split(str);
      	for(String s: parts){
			System.out.println(s);
        }
    }
}