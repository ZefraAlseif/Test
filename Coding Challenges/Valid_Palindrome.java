import java.util.Scanner;

public class Valid_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine()); // Number of Trials
        //sc.next();
        while (T>0){
            String s = sc.nextLine();
            System.out.println(s);
            System.out.println(isPalindrome(s));
            T--;
        }
        sc.close();
    }

    public static boolean isPalindrome(String s) {
        // convert all characters of string to lowerCase
        boolean result = true;
        s = s.toLowerCase();
        for (int i = 0; i<s.length(); i++){
            char temp = s.charAt(i);
            if (!Character.isLetter(temp) && !Character.isDigit(temp)){
                s = s.replace(temp,' ');
            }
        }
        s = s.replaceAll("\\s","");
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) != s.charAt(s.length()-1-i)){
                result = false;
                break;
            }
        }
        return result;
    }
}
