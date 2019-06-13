import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        StringBuilder temp = new StringBuilder("");
        int sb1_len = sb1.length();
        int sb2_len = sb2.length();
        for(int idx = 0; idx <= (sb1_len -1); idx++){
            char ch = sb1.charAt(idx);
            temp.append(ch);     
        }
        for(int idx = 0; idx <= (sb1_len -1); idx++){
            char ch = sb1.charAt(idx);
            temp.append(ch);     
        }
        int temp_len = temp.length();
        // The searching function is calling 
      	int indx = substring_searching(temp, temp_len, sb2, sb2_len);
        if(indx != -1){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
    public static int substring_searching(StringBuilder str1, int str1_len, StringBuilder str2, int str2_len)
    {
        int matching_idx = -1;
        for (int i = 0; i < (str1_len - str2_len + 1); i++)
        {
            boolean is_matching = true;
            for(int j = 0; j < str2_len; j++)
            {
				if(str1.charAt(i + j) != str2.charAt(j))
                {
					is_matching = false;
                }
            }
            if(is_matching == true)
            {
                matching_idx = i;
                break;
            }
        }
        return matching_idx;
    }
}