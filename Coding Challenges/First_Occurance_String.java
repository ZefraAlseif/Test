import java.util.Scanner;

public class First_Occurance_String {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt(); // Number of trials
       while (T>0) {
        String haystack = sc.next();
        String needle = sc.next();
        System.out.println(strStr(haystack, needle));
        T--;
       }   
       sc.close();
    }

    public static int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)){
            return -1;
        }
        else {
            int result = firstOcc(haystack,needle);
            return result;
        }
    }

    public static int firstOcc(String haystack, String needle){
        int count = 0;
        while (count + needle.length() < haystack.length()){
            String subSt = haystack.substring(count,count+needle.length());
            if (needle.equals(subSt)){
                return count;
            }
            else {
                count++;
            }
        }
        return count;
    }
}
