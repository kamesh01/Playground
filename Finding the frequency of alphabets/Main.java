import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int str_len = sb.length();
      int freq[] = new int[70];
      
      for(int i = 0; i < str_len; i++){
         if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z'){
            int offset = sb.charAt(i) - 'A';
            char ch = (char)('a' + offset);
           sb.setCharAt(i, ch);
         }
        if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z'){
            int offset = sb.charAt(i) - 'a';
          freq[offset]++;
         }
      }// end of first for loop
      
      for(int i = 0; i < str_len; i++){
         int offset = sb.charAt(i) - 'a';
        if(freq[offset] != 0){
           System.out.print(sb.charAt(i)+""+freq[offset]+" ");
          freq[offset] = 0;
        }
      }
    }
}