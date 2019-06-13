import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    System.out.println(count_occurance(str1,str2));
  }
  public static int count_occurance(String str1, String str2){
    int str1_len = str1.length();
    int str2_len = str2.length();
    int occur_count = 0;
    for(int i = 0; i < (str1_len - str2_len + 1); i++){
      boolean is_match = true;
      for(int j = 0; j < str2_len; j++){
         if(str1.charAt(i + j) != str2.charAt(j)){
            is_match = false;
         }
       }
      if(is_match == true){
         occur_count++;
      }
    }
    return occur_count;
  }
}