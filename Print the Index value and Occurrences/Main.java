import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
       // type your code here
      	Scanner sc = new Scanner(System.in);
      	String word = sc.nextLine();
      	String str = sc.nextLine();
      	Pattern ptrn = Pattern.compile(word);
      	Matcher match = ptrn.matcher(str);
      	
      	int temp = 0;
      	while(match.find()){
        	temp++;
          	System.out.println("found: "+temp+" : "+match.start()+" - "+match.end());
        }
      	if(temp == 0){
          	System.out.println("The given word is not present in the string");
        }
        else
           System.out.println(temp);
    }
}