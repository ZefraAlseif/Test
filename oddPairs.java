import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    List<long[]> oddPairs = new ArrayList<>();
    for (int i = 0; i < T; i++) {
      long N = sc.nextLong();
      oddPairs = oddPairs(N);
      System.out.println(oddPairs.size());
      //System.out.println(oddPairs);
    }
  }

  public static List<long[]> oddPairs(long N) {
    List<long[]> oddP = new ArrayList<>();
    // store variables j,j+1 and j+1,j
    // store variables j,j+3 and j+3,j
    for (long j = 1; j <= N; j++) {
      for (long k = 1; j+k <= N; k += 2) {
        oddP.add(new long[]{j,j+k});
        oddP.add(new long[]{j+k,j});
        //System.out.println("K:"+k);
      }
        //System.out.println("J:"+j);
      
    }
    return oddP;
  }
}

