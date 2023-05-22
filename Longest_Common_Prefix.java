// First 
class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Work with two pointers to find the largest 
        String initial = strs[0];
        String result = "";
        String temp_two = "";
        boolean check = true;
        if (strs.length <= 1){
            return initial;
        }
        loop_outer:
        for (int i =0; i<=initial.length();i++){   
            String temp_one = initial.substring(0,i);
            for (String str : strs){
                try {
                temp_two = str.substring(0,i);
                }
                catch (Exception e){
                    System.out.println("String Index out of Bounds");
                    temp_two = "";
                    break loop_outer;
                }
                if (temp_one.contains(temp_two)){
                    check = true;
                }
                else {
                    check = false;
                    break;
                }
            }
            if (check) {
                result = temp_one;
            }
            else {
                break;
            }
        }

        return result;
    }
}

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        
    }

    public static String longestCommonSubstring(String[] strs){
        
        // Work with two pointers to find the largest 
        String initial = strs[0];
        String result = "";
        String test = "";
        for (int i = 0; i<initial.length() -1 ;i++){
            for (int j = i +1; j<initial.length();j++){
                test = initial.substring(i,j);
                boolean check = commonPrefixTest(test,strs);
                if (check){
                    if (result.length() <= test.length()){
                        result = test;
                    }
                }
            }
        }
        return result;
    }

    public static boolean commonPrefixTest(String test, String[] strs){
        boolean check = true;
        int i = 1;
        while (i < strs.length){
            if (!strs[i].contains(test)){
                check = false;
                break;
            }
            i++;
        }
        return check;
    }
}

