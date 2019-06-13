import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int str_len = sb.length();
      int freq_arr[] = new int[26]; // By default all the elements inside of any array is zero
      
      for(int i = 0; i < str_len; i++){
         if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z'){
            freq_arr[sb.charAt(i) - 'A']++;
         }
        if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z'){
            freq_arr[sb.charAt(i) - 'a']++;
         }
      }
      // Printing the final output
      for(int i = 0; i < 26; i++){
         if(freq_arr[i] == 0){
            char missed_char = (char)(i + 'a');
           System.out.print(missed_char+" ");
         }
      }
      
      
    }
}