import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] words = str.split(" ");
    for(int i = 0; i < words.length; i++){
    	if(words[i] != null){
        	for(int j = i+1; j < words.length; j++){	// this loop is for camparision
            	if(words[i].equals(words[j])){
                	words[j] = null;	// deleting duplicate strings
                }
            }
        }
    }
    // Displaying the String without duplicate
    for(int i = 0; i < words.length; i++){
    	if(words[i] != null){
        	System.out.print(words[i]+" ");
        }
    }
  }
}