import java.util.Arrays;;

public class main1 {

    public static boolean isValid(String s) {

        if (s.length() % 2 != 0 || s.isEmpty())
            return false;

        char[] chrs = s.toCharArray();
        for(int i = 0; i <= chrs.length ; i ++){
            if(chrs[i] == ')' || chrs[i] == ']' || chrs[i] == '}'){
                char[] chr_end = Arrays.copyOfRange(chrs, i, chrs.length);
            }
        }

        
       
    }

    public static void main(String[] args) {
        String test = "";
        System.out.println(isValid(test));
    }
}