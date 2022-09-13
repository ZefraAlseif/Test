import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    boolean check = false;
    sc.nextLine();
    for (int i = 0; i < T; i++) {
      String s = sc.nextLine();
      StringBuilder sb = new StringBuilder(s);
      //sb.indexOf(s.charAt(0));
      if (s.length() % 2 != 0) {
        sb.deleteCharAt(s.length() / 2);
      }
      /*
      String s1 = sb.substring(0, sb.length() / 2);
      System.out.println("SubS1: "+s1);
      StringBuilder s2 = new StringBuilder((sb.substring(sb.length() / 2, sb.length())));
      System.out.println("SubS2: "+s2);*/
      check =  result(sb.substring(0, sb.length() / 2).toCharArray(),sb.substring(sb.length() / 2,           sb.length()).toCharArray());
      if (check){
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
    }
  }

  public static boolean result(char [] a, char [] b) {

    Arrays.sort(a);
    Arrays.sort(b);
    return Arrays.equals(a,b);
  }
}
  