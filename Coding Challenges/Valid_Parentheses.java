/* "Works for all Cases"
boolean result = true;
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i<s.length();i++){
            list.add(s.substring(i, i+1));
        }
        HashMap<String,String> vp = new HashMap<String,String>();
        vp.put("(",")");
        vp.put("[","]");
        vp.put("{","}");
        while (!list.isEmpty()){
            String temp = list.get(0);
            if (list.get(1).equals(vp.get(temp))){
                list.remove(temp);
                list.remove(vp.get(temp));
            }
            else {
                result = false;
                break;
            }
        } 
        return result;
    }


*/

//import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
//import java.util.List;
import java.util.Scanner;

// Works for all cases taking into account order and completeness
public class Valid_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            String temp = sc.next();
            System.out.println(isValid(temp));
        }
        sc.close();
    }

    public static boolean isValid(String s) {
        boolean result = true;
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i<s.length();i++){
            list.add(s.substring(i, i+1));
        }
        HashMap<String,String> vp = new HashMap<String,String>();
        vp.put("(",")");
        vp.put("[","]");
        vp.put("{","}");
        while (!list.isEmpty()){
            String temp = list.get(0);
            if (list.contains(vp.get(temp))){
                list.remove(temp);
                list.remove(vp.get(temp));
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
}
