import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
		Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	reverse_words(str);		// function call
  }
  	public static void reverse_words(String str)
   {
	String[] words = str.split(" ");
	String reverse_str = "";
	for (int i = 0; i < words.length; i++)
    {
      String word = words[i]; 
      String reverse_wrd = "";
      for (int j = word.length()-1; j >= 0; j--) 
	  {
        reverse_wrd = reverse_wrd + word.charAt(j);
      }
	  reverse_str = reverse_str + reverse_wrd + " ";
	}
	System.out.println(reverse_str);
   }
}