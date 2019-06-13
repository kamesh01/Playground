import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String removed = removeVowels(str);
    System.out.println(removed);
  }
  // This is called first then
  public static String removeVowels(String str){
  	String finalString = "";
    for(int i = 0; i < str.length(); i++){
    	if( !isVowel(Character.toLowerCase(str.charAt(i)))){
        	finalString = finalString + str.charAt(i);
        }
    }
    return finalString; // It is retuning inside the main method and print a string after removing the vowels
  }
  // This is called to check whether the string is vowel or not
  	public static boolean isVowel(char c)
   {
     String vowels = "aeiou";
     int i;
     for(i=0; i<5; i++)
     {
       if(c == vowels.charAt(i))
       {
         return true;
       }
     }
     return false;
   }
}