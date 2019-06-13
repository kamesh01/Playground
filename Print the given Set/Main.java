import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashSet<String> lhs = new LinkedHashSet<String>();
      String set = br.readLine(); // Taking input
      String[] arr = set.split(",");
      for(int i = 0; i < arr.length; i++){
      	lhs.add(arr[i]); // Adding elements from an array to a set
      }
      System.out.println(lhs); // Displaying set object
    }
}