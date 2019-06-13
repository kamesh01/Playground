import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int str_len = str.length();
      plindrome_check(str,str_len);
    }
  public static void plindrome_check(String str, int str_len){
    boolean is_plindrome = true;
    int last_idx = str_len-1;
    int first_idx = 0;
    while( first_idx < last_idx){
      if(str.charAt(first_idx) != str.charAt(last_idx)){
        is_plindrome = false;
        break;
      }
      first_idx++;
      last_idx--;
    }
    if(is_plindrome == true){
       System.out.println("Yes");
    }else{
       System.out.println("No");
    }
  }
}