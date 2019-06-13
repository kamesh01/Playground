import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	LinkedList<String> llist = new LinkedList<String>();
      	String month = br.readLine(); // reading string
      	String[] arr = month.split(",");// spliting string based on commas
      	for(int i = 0; i < arr.length; i++){
        	llist.add(arr[i]); // adding array elements into a Linked list
        }
      	System.out.println(llist);
      	System.out.println("Size of the linked list: "+llist.size());
      	System.out.println("Is LinkedList empty? "+llist.isEmpty());
      	String m1 = br.readLine(); // Taking a month's name
      	System.out.println("Does LinkedList contains "+m1+"?");
      	System.out.println(llist.contains(m1));
      	
    }
}